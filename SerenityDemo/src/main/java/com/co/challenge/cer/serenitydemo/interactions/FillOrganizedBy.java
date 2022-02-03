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

public class FillOrganizedBy implements Interaction {

    private List<OrganizationAndMeet> organizationAndMeet;

    public FillOrganizedBy(DataTable organizationAndMeet) {
        this.organizationAndMeet = organizationAndMeet.asList(OrganizationAndMeet.class);
    }

    public static FillOrganizedBy of(DataTable organizationAndMeet){
        return Tasks.instrumented(FillOrganizedBy.class, organizationAndMeet);
    }

    @Step("Fill fields of OrganizedBy")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ORGANIZ), Enter.theValue(organizationAndMeet.get(0).getContacTitle()).into(INPUT_TITLEOR),
                Enter.theValue(organizationAndMeet.get(0).getContactFirstName()).into(INPUT_FIRSTNAOR),
                Enter.theValue(organizationAndMeet.get(0).getContactLastName()).into(INPUT_LASTNAOR),
                Enter.theValue(organizationAndMeet.get(0).getContactEmail()).into(INPUT_EMAIOR),
                Enter.theValue(organizationAndMeet.get(0).getContactId()).into(INPUT_IDENOR),
                Click.on(OPT_AUX), Click.on(OPT_AUXS.of(organizationAndMeet.get(0).getContactUser())),
                Click.on(BTN_SAVEMEETTYPE)
        );
    }
}
