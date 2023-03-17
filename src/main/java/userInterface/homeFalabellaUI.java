package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class homeFalabellaUI {

    public static final Target BTN_LOG_IN = Target.the("Button to start sesion")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/loginButton']");
    public static final Target LBL_TEXT_HOME = Target.the("text to validate in home")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/loginTextView']");
    public static final Target BTN_MORE_BUTTON = Target.the("Button to option in app falabella")
            .locatedBy("//*[contains(@text, 'Más')]");
    public static final Target BTN_SIGN_OUT = Target.the("button to sign out in app falabella")
            .locatedBy("//*[contains(@text, 'Cerrar Sesión')]");
    public static final Target TXT_SECOND_TEXT_HOME = Target.the("second text to validate in home")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/header_text']");
}
