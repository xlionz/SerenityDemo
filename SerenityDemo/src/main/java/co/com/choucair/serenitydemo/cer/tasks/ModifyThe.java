package co.com.choucair.serenitydemo.cer.tasks;

import co.com.choucair.serenitydemo.cer.interactions.Upload;
import co.com.choucair.serenitydemo.cer.interactions.Wait;
import co.com.choucair.serenitydemo.cer.models.Product;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.*;

@AllArgsConstructor
public class ModifyThe implements Task {

    private Product product;
    private String oldName;

    public static ModifyThe product(Product product, String oldName){
        return Tasks.instrumented(ModifyThe.class, product, oldName);
    }

    @Step("{0} modify the new product.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("NAME_PRODUCT", product.getProductName());

        actor.attemptsTo(
                Enter.theValue(oldName).into(INPUT_SEARCH),
                Click.on(BTN_SEARCH),
                Click.on(LBL_TITLE_PRODUCT.of(oldName)),
                Enter.theValue(product.getProductName()).into(INPUT_PRODUCT_NAME),
                Upload.file(product.getProductImg()),
                Enter.theValue(product.getQuantityPerUnit()).into(INPUT_QUANTITY_UNIT),
                Enter.theValue(product.getUnitPrice()).into(INPUT_UNIT_PRICE),
                Enter.theValue(product.getUnitsInStock()).into(INPUT_UNITS_STOCK),
                Enter.theValue(product.getUnitsOnOrder()).into(INPUT_UNITS_ODER),
                Enter.theValue(product.getReoderLevel()).into(INPUT_REODER_LVL),
                Scroll.to(BTN_SAVE_PRODUCT), Wait.seconds(2),
                Click.on(BTN_SAVE_PRODUCT)
        );
    }
}
