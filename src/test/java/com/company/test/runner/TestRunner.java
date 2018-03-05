package com.company.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"test/java/com/company/test/feature/login"},
        glue = {"test/java/com/company/test/step"},
        format = {"html: target/cucumber-html-reports","json: target/cucumber-html-reports/cucumber.json"}
)
public class TestRunner {
}
