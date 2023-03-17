package Task;

import interactions.FinishRegistration;
import interactions.GoToRegisterMe;
import interactions.InteractWithObjectRegister;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RegisterToUserFalabella implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                GoToRegisterMe.onApp(),
                InteractWithObjectRegister.list(),
                FinishRegistration.onApp()
        );
    }
    public static RegisterToUserFalabella onApp(){
        return Instrumented.instanceOf(RegisterToUserFalabella.class).withProperties();
    }
}
