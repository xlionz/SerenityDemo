package co.com.choucair.serenitydemo.cer.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@AllArgsConstructor
public class Wait implements Interaction {
    private int num;

    public static Wait seconds(int num) {
        return Tasks.instrumented(Wait.class, num);
    }

    @Step("{0} waits seconds.")
    @Override
    public <T extends Actor> void performAs(T actor) {
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos((long) num * 1000));
    }
}
