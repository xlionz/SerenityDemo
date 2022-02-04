package com.co.challenge.cer.serenitydemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class OrganizationPage {
    public static final Target LBL_ORGAN = Target.the("Label of organization.").locatedBy("//*[text() = 'Organization']");
    public static final Target LBL_BUSSUN = Target.the("Label of bussines unit.").locatedBy("(//*[text()='Business Units'])[1]");
    public static final Target BTN_NEWBU = Target.the("Button of new bussines unit.").locatedBy("//*[contains(text(), 'New Business Unit')]");
    public static final Target INPUT_NAME = Target.the("Input of name new bussines unit").locatedBy("id:Serenity_Pro_Organization_BusinessUnitDialog3_Name");
    public static final Target BTN_SAVE = Target.the("Button of save new bussines unit.").locatedBy("//*[contains(text(), 'Save')]");
}