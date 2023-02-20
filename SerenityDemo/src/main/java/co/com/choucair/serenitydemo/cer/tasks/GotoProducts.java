package co.com.choucair.serenitydemo.cer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.LBL_NORTHWIND;
import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.LBL_PRODUCTS;

public class GotoProducts implements Task {

    public static GotoProducts inSerenityDemo(){
        return Tasks.instrumented(GotoProducts.class);
    }

    @Step("{0} go to the products.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_NORTHWIND),
                Click.on(LBL_PRODUCTS)
        );
    }
}
