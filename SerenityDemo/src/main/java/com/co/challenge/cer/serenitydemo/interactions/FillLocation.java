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

public class FillLocation implements Interaction {

    private List<OrganizationAndMeet> organizationAndMeet;

    public FillLocation(DataTable organizationAndMeet) {
        this.organizationAndMeet = organizationAndMeet.asList(OrganizationAndMeet.class);
    }

    public static  FillLocation of(DataTable organizationAndMeet){
        return Tasks.instrumented(FillLocation.class, organizationAndMeet);
    }

    @Step("Fill fields of location.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(organizationAndMeet.get(0).getNameLocation()).into(INPUT_NAMELO),
                Enter.theValue(organizationAndMeet.get(0).getAddresLocation()).into(INPUT_ADDRES),
                Enter.theValue(organizationAndMeet.get(0).getLatitudeLocation()).into(INPUT_LATITUDE),
                Enter.theValue(organizationAndMeet.get(0).getLongitudeLocation()).into(INPUT_LONGITUDE),
                Click.on(BTN_SAVEMEETTYPE)
        );
    }
}
