package com.co.challenge.cer.serenitydemo.tasks;

import com.co.challenge.cer.serenitydemo.models.User;
import io.cucumber.datatable.DataTable;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ClickInteraction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static com.co.challenge.cer.serenitydemo.userinterface.HomePage.*;

public class Login  implements Task {

    private List<User> users;

    public Login(DataTable users) {
        this.users = users.asList(User.class);
    }

    public static Login of(DataTable data){
        return Tasks.instrumented(Login.class, data);
    }

    @Step("Login on serenity demo.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(users.get(0).getUserName()).into(INPUT_USERNA),
                Enter.theValue(users.get(0).getPassword()).into(INPUT_PASSWO),
                Click.on(BTN_LOGIN)
        );
    }
}
