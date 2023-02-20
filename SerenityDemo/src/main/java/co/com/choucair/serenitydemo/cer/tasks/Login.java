package co.com.choucair.serenitydemo.cer.tasks;

import co.com.choucair.serenitydemo.cer.models.Account;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.LoginPage.*;

@AllArgsConstructor
public class Login implements Task {

    private Account account;

    public static Login serenityDemo(Account account){
        return Tasks.instrumented(Login.class, account);
    }

    @Step("{0} login in Demo Serenity.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(account.getName()).into(INPUT_USERNAME),
                Enter.theValue(account.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_SIGN_IN)
        );
    }
}
