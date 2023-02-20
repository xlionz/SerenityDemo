package co.com.choucair.serenitydemo.cer.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demo_modules.feature",
        glue = "co.com.choucair.serenitydemo.cer.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DemoModulesRunner {
}
