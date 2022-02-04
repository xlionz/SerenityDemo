package com.co.challenge.cer.serenitydemo.stepdefinitions;

import com.co.challenge.cer.serenitydemo.enums.MsgError;
import com.co.challenge.cer.serenitydemo.exceptions.ExceptionError;
import com.co.challenge.cer.serenitydemo.questions.GetText;
import com.co.challenge.cer.serenitydemo.tasks.FillFieldsMeeting;
import com.co.challenge.cer.serenitydemo.tasks.FillFieldsOrganization;
import com.co.challenge.cer.serenitydemo.tasks.Login;
import com.co.challenge.cer.serenitydemo.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.co.challenge.cer.serenitydemo.userinterface.MeetinPage.LBL_MEETINGNA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class NewMeetingStepDefinition {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("{string} is in the url")
    public void isInTheUrl(String user) {
        theActorCalled(user).wasAbleTo(Open.browserOn(new HomePage()));
    }

    @When("login on serenitydemo")
    public void loginOnSerenitydemo(io.cucumber.datatable.DataTable data) {
        theActorInTheSpotlight().attemptsTo(
                Login.of(data)
        );
    }

    @When("creates a new bussines unit and create a new meeting and create a new meeting")
    public void createsANewBussinesUnitAndCreateANewMeetingAndCreateANewMeeting(io.cucumber.datatable.DataTable data) {
        theActorInTheSpotlight().attemptsTo(
                FillFieldsOrganization.of(data),
                FillFieldsMeeting.of(data)
        );
    }

    @Then("check that the meeting has been created with the name of {string}")
    public void checkThatTheMeetingHasBeenCreatedWithTheName(String msg) {
        theActorInTheSpotlight().should(seeThat(GetText.field(LBL_MEETINGNA.of(msg)), equalTo(msg))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), msg,
                        GetText.field(LBL_MEETINGNA.of(msg)).answeredBy(theActorInTheSpotlight()))));
    }
}
