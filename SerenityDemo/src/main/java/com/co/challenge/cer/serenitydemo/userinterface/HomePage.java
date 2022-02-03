package com.co.challenge.cer.serenitydemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://serenity.is/demo/")
public class HomePage extends PageObject {
    public static final Target INPUT_USERNA = Target.the("Input of user name.").locatedBy("id:StartSharp_Membership_LoginPanel0_Username");
    public static final Target INPUT_PASSWO = Target.the("Input of password.").locatedBy("id:StartSharp_Membership_LoginPanel0_Password");
    public static final Target BTN_LOGIN = Target.the("Button of sign in.").locatedBy("id:StartSharp_Membership_LoginPanel0_LoginButton");
}
