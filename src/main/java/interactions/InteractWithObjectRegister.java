package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static utils.ExcelDataTable.ReadData;


public class InteractWithObjectRegister implements Interaction {
    public ArrayList<Map<String, String>> dataExcel;
    public static Target LBL_REGISTER = null;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            dataExcel = ReadData("Data.xlsx", "locators");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i=0; i<dataExcel.size();i++){

            LBL_REGISTER = Target.the("fill data").locatedBy(dataExcel.get(i).get("xpath"));

            actor.attemptsTo(
                    Enter.theValue(dataExcel.get(i).get("data")).into(LBL_REGISTER)
            );



        }

    }
    public static InteractWithObjectRegister list(){
        return Instrumented.instanceOf(InteractWithObjectRegister.class).withProperties();
    }
}
