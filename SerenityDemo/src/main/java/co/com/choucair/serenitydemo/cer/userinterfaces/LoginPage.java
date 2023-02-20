package co.com.choucair.serenitydemo.cer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target INPUT_USERNAME = Target.the("Input of username")
            .locatedBy("//input[@name = 'Username']");
    public static final Target INPUT_PASSWORD = Target.the("Inpit of password.")
            .locatedBy("//input[@name = 'Password']");
    public static final Target BTN_SIGN_IN = Target.the("Button to sign in.")
            .locatedBy("//button[@type = 'submit']");
}
