package com.co.challenge.cer.serenitydemo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/new_meeting.feature",
        glue = {"com.co.challenge.cer.serenitydemo.stepdefinitions", "com.co.challenge.cer.serenitydemo.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class NewMeeting {
}
