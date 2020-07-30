package nl.fatih.runners;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            monochrome = true,
            plugin = {"pretty", "html:target/cucumberHtmlReport"},
            features = {"src/test/resources/features/"},
            tags = {"@iOS"},
            glue = {"nl.fatih.stepDefinitions"}
    )
    public class AppiumiOSRunner {
    }

