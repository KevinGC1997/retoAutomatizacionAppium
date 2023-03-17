package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class loginFalabellaUI {
    public static final Target BTN_CHECK_IN = Target.the("Button to register")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/tv_registerlink']");
    public static final Target LBL_TEXT_LOGIN = Target.the("text to validate in login")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/tv_titleforgotpassword']");
    public static final Target LBL_USER_BOX = Target.the("user box")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/text_input_email']");
    public static final Target LBL_PASSWORD_BOX = Target.the("password box")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/text_input_password']");
    public static final Target BTN_LOG_IN1 = Target.the("button to login user")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/button_falabella_login']");
}
