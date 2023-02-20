package co.com.choucair.serenitydemo.cer.stepdefinitions;


import co.com.choucair.serenitydemo.cer.exceptions.ExceptionError;
import co.com.choucair.serenitydemo.cer.questions.TheProduct;
import co.com.choucair.serenitydemo.cer.tasks.CreateProduct;
import co.com.choucair.serenitydemo.cer.tasks.GotoProducts;
import co.com.choucair.serenitydemo.cer.tasks.Login;
import co.com.choucair.serenitydemo.cer.tasks.ModifyThe;
import co.com.choucair.serenitydemo.cer.utils.ReadFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoModulesStepDefinition {
    @Given("{string} logs in SerenityDemo")
    public void logsInSerenityDemo(String account) {
        theActorInTheSpotlight().attemptsTo(
                Login.serenityDemo(ReadFiles.readAccount(account))
        );
    }

    @When("selects the product page")
    public void selectsTheProductPage() {
        theActorInTheSpotlight().attemptsTo(
                GotoProducts.inSerenityDemo()
        );
    }

    @When("clicks on create product and fills the form with the information {string}")
    public void createAProduct(String product) {
        theActorInTheSpotlight().attemptsTo(
                CreateProduct.inSerenityDemo(ReadFiles.readProduct(product))
        );
    }

    @When("searches the new product and try to modify {string} {string}")
    public void searchesTheNewProductAndTryToModify(String prodctModify, String productToModify){
        theActorInTheSpotlight().attemptsTo(
                ModifyThe.product(ReadFiles.readProduct(prodctModify),
                        ReadFiles.readProduct(productToModify).getProductName())
        );
    }

    @Then("searches the product and should see the product name")
    public void searchesTheProductAndShouldSeeTheProductName() {
        theActorInTheSpotlight().should(seeThat(TheProduct.exists())
                .orComplainWith(ExceptionError.class));
    }
}
