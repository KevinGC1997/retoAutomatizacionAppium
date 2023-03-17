package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.homeFalabellaUI.*;
import static userInterface.loginFalabellaUI.*;
import static utils.ExcelDataTable.ReadData;

public class GoToRegisterMe implements Interaction {
    public ArrayList<Map<String, String>> dataExcelValidation;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            dataExcelValidation = ReadData("Data.xlsx", "locators");
        } catch (IOException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                WaitUntil.the(BTN_LOG_IN, isVisible()).forNoMoreThan(50).seconds(),
                Ensure.that(LBL_TEXT_HOME).text().contains(dataExcelValidation.get(0).get("home validate")),
                Click.on(BTN_LOG_IN),
                Ensure.that(LBL_TEXT_LOGIN).text().contains(dataExcelValidation.get(0).get("login validate")),
                WaitUntil.the(BTN_CHECK_IN, isVisible()).forNoMoreThan(129).seconds(),
                Click.on(BTN_CHECK_IN)
        );

    }
    public static GoToRegisterMe onApp(){
        return Instrumented.instanceOf(GoToRegisterMe.class).withProperties();
    }
}
