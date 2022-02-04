package com.co.challenge.cer.serenitydemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MeetinPage {
    public static final Target LBL_MEET = Target.the("Label of meetin.").locatedBy("//*[text()='Meeting']");
    public static final Target LBL_MEETINGS = Target.the("Label of meetings.").locatedBy("//*[text()='Meetings']");
    public static final Target BTN_NEWMEET = Target.the("Button of new meeting.").locatedBy("//*[contains(text(), 'New Meeting')]");
    public static final Target INPUT_NAMEME = Target.the("Input of name meeting.").locatedBy("id:Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static final Target BTN_MEETTYP = Target.the("Button of meeting type.").locatedBy("//*[@class='inplace-button inplace-create edit']");
    public static final Target INPUT_MEETNAMETYPE = Target.the("Input of name type.").locatedBy("//*[contains(@id, 'Serenity_Pro_Meeting_MeetingTypeDialog') and contains(@id, '_Name')]");
    public static final Target BTN_SAVEMEETTYPE = Target.the("Button of save name type.").locatedBy("(//*[contains(text(), 'Save')])[2]");
    public static final Target OPT_STARDATE = Target.the("Options of star date.").locatedBy("id:Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static final Target INPUT_MEETNUM = Target.the("Input of meeting number.").locatedBy("id:Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    public static final Target OPT_HOURSTAR = Target.the("Options of star hour.").locatedBy("//*[contains(@class, 'editor s-DateTimeEditor time')]");
    public static final Target OPT_ENDDATE = Target.the("Options of end date.").locatedBy("id:Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    public static final Target OPT_ENDHOUR = Target.the("Options of end hour.").locatedBy("(//*[contains(@class, 'editor s-DateTimeEditor time')])[2]");
    public static final Target BTN_LOCATION = Target.the("Button of location.").locatedBy("(//*[contains(@class, 'inplace-button inplace-create')])[2]");
    public static final Target INPUT_NAMELO = Target.the("Input of location name.").locatedBy("//*[contains(@id, 'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id, 'Name')]");
    public static final Target INPUT_ADDRES = Target.the("Input of Addres.").locatedBy("//*[contains(@id, 'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id, '_Address')]");
    public static final Target INPUT_LATITUDE = Target.the("Input of latitude.").locatedBy("//*[contains(@id, 'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id, '_Latitude')]");
    public static final Target INPUT_LONGITUDE = Target.the("Input of longitude.").locatedBy("//*[contains(@id, 'Serenity_Pro_Meeting_MeetingLocationDialog') and contains(@id, '_Longitude')]");
    public static final Target BTN_UNIT = Target.the("Button of unit.").locatedBy("(//*[contains(@class, 'inplace-button inplace-create')])[3]");
    public static final Target OTP_PARENTU = Target.the("Options of paren unit").locatedBy("//*[contains(text(), '{0}')]");
    public static final Target INPUT_NAMEUNI = Target.the("Input of name unit.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_BusinessUnitDialog') and contains(@id, '_Name')]");
    public static final Target BTN_ORGANIZ = Target.the("Button of organized by.").locatedBy("(//*[contains(@class, 'inplace-button inplace-create')])[4]");
    public static final Target INPUT_TITLEOR = Target.the("Input of title organized by.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_ContactDialog') and contains(@id, '_Title')]");
    public static final Target INPUT_FIRSTNAOR = Target.the("Input of first name organized by.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_ContactDialog') and contains(@id, '_FirstName')]");
    public static final Target INPUT_LASTNAOR = Target.the("Input of lastname organized by.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_ContactDialog') and contains(@id, '_LastName')]");
    public static final Target INPUT_EMAIOR = Target.the("Input of email organized by.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_ContactDialog') and contains(@id, '_Email')]");
    public static final Target INPUT_IDENOR = Target.the("Input of identity number organized by.").locatedBy("//*[contains(@id, 'Serenity_Pro_Organization_ContactDialog') and contains(@id, '_IdentityNo')]");
    public static final Target OPT_AUX = Target.the("Options of aux.").locatedBy("(//*[contains(@id, 'select2-chosen-')])[12]");
    public static final Target OPT_AUXS = Target.the("Options of auxs.").locatedBy("(//*[contains(text(), '{0}')])[3]");
    public static final Target BTN_REPORTER = Target.the("Button of reporter options.").locatedBy("(//*[contains(@class, 'inplace-button inplace-create')])[5]");
    public static final Target BTN_ATTENDEE = Target.the("Button of Attendee options.").locatedBy("(//*[contains(@class, 'inplace-button inplace-create')])[6]");
    public static final Target BTN_SAVEMEET = Target.the("Button of save meeting.").locatedBy("(//*[@class='button-inner'])[4]");
    public static final Target LBL_MEETINGNA = Target.the("Label of meeting name.").locatedBy("//*[text()='{0}']");
}
