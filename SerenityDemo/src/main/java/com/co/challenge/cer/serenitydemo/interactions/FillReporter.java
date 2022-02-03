package com.co.challenge.cer.serenitydemo.interactions;

import com.co.challenge.cer.serenitydemo.models.OrganizationAndMeet;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static com.co.challenge.cer.serenitydemo.userinterface.MeetinPage.*;

public class FillReporter implements Interaction {

    private List<OrganizationAndMeet> organizationAndMeet;

    public FillReporter(DataTable organizationAndMeet) {
        this.organizationAndMeet = organizationAndMeet.asList(OrganizationAndMeet.class);
    }

    public static  FillReporter of(DataTable organizationAndMeet){
        return Tasks.instrumented(FillReporter.class, organizationAndMeet);
    }

    @Step("Fill fields of reporte.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REPORTER),
                Enter.theValue(organizationAndMeet.get(0).getReporterTitle()).into(INPUT_TITLEOR),
                Enter.theValue(organizationAndMeet.get(0).getReporterFirstName()).into(INPUT_FIRSTNAOR),
                Enter.theValue(organizationAndMeet.get(0).getReporterLastName()).into(INPUT_LASTNAOR),
                Enter.theValue(organizationAndMeet.get(0).getReporterEmail()).into(INPUT_EMAIOR),
                Enter.theValue(organizationAndMeet.get(0).getReporterId()).into(INPUT_IDENOR),
                Click.on(OPT_AUX), Click.on(OPT_AUXS.of(organizationAndMeet.get(0).getContactUser())),
                Click.on(BTN_SAVEMEETTYPE)
        );
    }
}
