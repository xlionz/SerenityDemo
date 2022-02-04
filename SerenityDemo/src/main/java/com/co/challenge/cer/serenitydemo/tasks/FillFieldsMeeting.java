package com.co.challenge.cer.serenitydemo.tasks;

import com.co.challenge.cer.serenitydemo.interactions.FillAttendeeList;
import com.co.challenge.cer.serenitydemo.interactions.FillLocation;
import com.co.challenge.cer.serenitydemo.interactions.FillOrganizedBy;
import com.co.challenge.cer.serenitydemo.interactions.FillReporter;
import com.co.challenge.cer.serenitydemo.models.OrganizationAndMeet;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import static com.co.challenge.cer.serenitydemo.userinterface.MeetinPage.*;

public class FillFieldsMeeting implements Task {

    private List<OrganizationAndMeet> organizationAndMeets;
    private final DataTable info;

    public FillFieldsMeeting(DataTable organizationAndMeets) {
        this.organizationAndMeets = organizationAndMeets.asList(OrganizationAndMeet.class);
        this.info = organizationAndMeets;
    }

    public static FillFieldsMeeting of(DataTable data) {
        return Tasks.instrumented(FillFieldsMeeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_MEET), Click.on(LBL_MEETINGS), Click.on(BTN_NEWMEET),
                Enter.theValue(organizationAndMeets.get(0).getMeetingName()).into(INPUT_NAMEME),
                Click.on(BTN_MEETTYP), Enter.theValue(organizationAndMeets.get(0).getMeetingType()).into(INPUT_MEETNAMETYPE),
                Click.on(BTN_SAVEMEETTYPE), Enter.theValue(organizationAndMeets.get(0).getMeetingNumber()).into(INPUT_MEETNUM),
                Enter.theValue(organizationAndMeets.get(0).getStarDate()).into(OPT_STARDATE),
                SelectFromOptions.byVisibleText(organizationAndMeets.get(0).getHourStar()).from(OPT_HOURSTAR),
                Enter.theValue(organizationAndMeets.get(0).getEndDate()).into(OPT_ENDDATE), Click.on(OPT_ENDDATE),
                SelectFromOptions.byVisibleText(organizationAndMeets.get(0).getHourEnd()).from(OPT_ENDHOUR),
                Click.on(BTN_LOCATION), FillLocation.of(info), Click.on(BTN_UNIT), Enter.theValue(organizationAndMeets.get(0).getUnit()).into(INPUT_NAMEUNI),
                Click.on(OPT_AUX), Click.on(OTP_PARENTU.of(organizationAndMeets.get(0).getNameBussinesUnit())),
                Click.on(BTN_SAVEMEETTYPE), FillOrganizedBy.of(info), FillReporter.of(info), FillAttendeeList.of(info),
                Click.on(BTN_SAVEMEET), Click.on(LBL_MEET)
        );
    }
}
