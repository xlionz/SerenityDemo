package co.com.choucair.serenitydemo.cer.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.FileToUpload;
import org.openqa.selenium.WebDriver;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.BTN_UPLOAD_FILE;


@AllArgsConstructor
public class Upload implements Interaction {

    private String fileName;

    public static Upload file(String fileName){
        return Tasks.instrumented(Upload.class, fileName);
    }

    @Step("{0} uploades the picture of the product.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();
        FileToUpload fileToUpload = new FileToUpload(webDriver,
                "src/main/resources/files/" + fileName + ".png");
        fileToUpload.fromLocalMachine().to(BTN_UPLOAD_FILE.resolveFor(actor));
    }
}
