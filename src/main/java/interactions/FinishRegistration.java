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
import static userInterface.registrationFormUI.*;
import static utils.ExcelDataTable.ReadData;

public class FinishRegistration implements Interaction {
    public ArrayList<Map<String, String>> dataExcelValidation;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            dataExcelValidation = ReadData("Data.xlsx", "locators");
        } catch (IOException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                WaitUntil.the(TXT_TEXT_REGISTRATION, isVisible()).forNoMoreThan(50).seconds(),
                Ensure.that(TXT_TEXT_REGISTRATION).text().contains(dataExcelValidation.get(0).get("registration validate")),
                Scroll.here(),
                WaitUntil.the(BTN_COUNTRY, isVisible()).forNoMoreThan(129).seconds(),
                Click.on(BTN_COUNTRY),
                Click.on(BTN_DOCUMENT_TYPE),
                Enter.theValue(dataExcelValidation.get(0).get("document number")).into(LBL_DOCUMENT_NUMBER),
                Click.on(BTN_GENDER),
                Click.on(LBL_DATE_OF_BIRTH),
                Click.on(BTN_ACCEPT),
                Enter.theValue(dataExcelValidation.get(0).get("movil number")).into(LBL_MOVIL_NUMBER),
                Click.on(BTN_ACCEPT_TERMS),
                Ensure.that(TXT_TEXT_TERMS_REGISTRATION).text().contains(dataExcelValidation.get(0).get("registration terms validate")),
                Click.on(BTN_REGISTERME)
        );
    }
    public static FinishRegistration onApp(){
        return Instrumented.instanceOf(FinishRegistration.class).withProperties();
    }
}
