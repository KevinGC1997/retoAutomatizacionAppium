package Task;

import interactions.SignOutAndLogIn;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LogsOutLogsBackIntoUserFalabella implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SignOutAndLogIn.onApp()
        );
    }
    public static LogsOutLogsBackIntoUserFalabella onApp(){
        return Instrumented.instanceOf(LogsOutLogsBackIntoUserFalabella.class).withProperties();
    }
}
