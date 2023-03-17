package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.homeFalabellaUI.*;
import static userInterface.loginFalabellaUI.*;
import static utils.ExcelDataTable.ReadData;

public class SignOutAndLogIn implements Interaction {

    public ArrayList<Map<String, String>> dataExcel;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            dataExcel = ReadData("Data.xlsx", "locators");
        } catch (IOException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_MORE_BUTTON, isVisible()).forNoMoreThan(40).seconds(),
                Click.on(BTN_MORE_BUTTON),
                Scroll.here(),
                Click.on(BTN_SIGN_OUT),
                Click.on(BTN_LOG_IN),
                Enter.theValue(dataExcel.get(3).get("data")).into(LBL_USER_BOX),
                Enter.theValue(dataExcel.get(4).get("data")).into(LBL_PASSWORD_BOX),
                Click.on(BTN_LOG_IN1),
                WaitUntil.the(TXT_SECOND_TEXT_HOME, isVisible()).forNoMoreThan(50).seconds(),
                Ensure.that(TXT_SECOND_TEXT_HOME).text().contains(dataExcel.get(0).get("home second validate"))
        );

    }
    public static SignOutAndLogIn onApp(){
        return Instrumented.instanceOf(SignOutAndLogIn.class).withProperties();
    }
}
