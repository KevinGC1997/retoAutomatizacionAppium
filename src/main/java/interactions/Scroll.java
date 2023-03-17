package interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.InvalidSelectorException;

import static appiumDriver.AppiumAndroidDriver.driver;

public class Scroll implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(20)"));
        } catch (InvalidSelectorException e) {
            // ignore

        }
    }
    public static Scroll here(){
        return Instrumented.instanceOf(Scroll.class).withProperties();
    }

}
