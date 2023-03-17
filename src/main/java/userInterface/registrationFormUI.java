package userInterface;


import net.serenitybdd.screenplay.targets.Target;

public class registrationFormUI {

    public static final Target TXT_TEXT_REGISTRATION = Target.the("text to validate in registration")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/tv_titleforgotpassword']");
    public static final Target BTN_COUNTRY = Target.the("button to select country")
            .locatedBy("//*[contains(@text, 'Colombia')]");
    public static final Target BTN_DOCUMENT_TYPE = Target.the("select type of document")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/documentone']");
    public static final Target LBL_DOCUMENT_NUMBER = Target.the("document number box")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/etDocumentNumber']");
    public static final Target BTN_GENDER = Target.the("button to choose gender")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/rb_male']");
    public static final Target LBL_DATE_OF_BIRTH = Target.the("date of birth box")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/et_dob']");
    public static final Target BTN_ACCEPT = Target.the("button to accept")
            .locatedBy("//*[@resource-id='android:id/button1']");
    public static final Target LBL_MOVIL_NUMBER = Target.the("movil number box")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/etPhoneCiam']");
    public static final Target BTN_ACCEPT_TERMS = Target.the("button to accept terms and conditions")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/cb_acceptpolicy']");
    public static final Target TXT_TEXT_TERMS_REGISTRATION = Target.the("text terms to validate in registration")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/tv_accept_policy']");
    public static final Target BTN_REGISTERME = Target.the("button to register me")
            .locatedBy("//*[@resource-id='com.falabella.falabellaApp:id/bv_register']");

}
