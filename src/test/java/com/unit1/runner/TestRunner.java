package com.unit1.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.unit1.hooks",
                "com.unit1.stepdefs"
        },
        features = {"src/test/resources/features/"},
        plugin = {
                "pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json"},
        tags = {"@test"}
)
public class TestRunner {
}
