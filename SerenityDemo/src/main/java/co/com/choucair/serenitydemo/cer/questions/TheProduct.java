package co.com.choucair.serenitydemo.cer.questions;

import co.com.choucair.serenitydemo.cer.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.*;

public class TheProduct implements Question<Boolean> {

    public static TheProduct exists(){
        return new TheProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameProduct = actor.recall("NAME_PRODUCT");

        actor.attemptsTo(
                Wait.seconds(1),
                Enter.theValue(nameProduct).into(INPUT_SEARCH),
                Click.on(BTN_SEARCH),
                Wait.seconds(1)
        );

        actor.attemptsTo(
                Ensure.that(nameProduct).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct).resolveFor(actor).getText())
        );

        return true;
    }
}
