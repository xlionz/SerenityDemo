package com.co.challenge.cer.serenitydemo.tasks;

import com.co.challenge.cer.serenitydemo.models.OrganizationAndMeet;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.co.challenge.cer.serenitydemo.userinterface.OrganizationPage.*;

public class FillFieldsOrganization implements Task {

    private List<OrganizationAndMeet> organizationAndMeets;

    public FillFieldsOrganization(DataTable organizationAndMeets) {
        this.organizationAndMeets = organizationAndMeets.asList(OrganizationAndMeet.class);
    }

    public static FillFieldsOrganization of(DataTable data){
        return Tasks.instrumented(FillFieldsOrganization.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_ORGAN), Click.on(LBL_BUSSUN),
                Click.on(BTN_NEWBU), Enter.theValue(organizationAndMeets.get(0).getNameBussinesUnit()).into(INPUT_NAME),
                Click.on(BTN_SAVE)
        );
    }
}
