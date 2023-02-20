package co.com.choucair.serenitydemo.cer.stepdefinitions.hooks;

import co.com.choucair.serenitydemo.cer.utils.WebDriverFactory;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.serenitydemo.cer.utils.Constans.URL_SERENITY_DEMO;


public class DriverHook {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb())));
        OnStage.theActorCalled("Automation").wasAbleTo(Open.url(URL_SERENITY_DEMO));
    }
}
