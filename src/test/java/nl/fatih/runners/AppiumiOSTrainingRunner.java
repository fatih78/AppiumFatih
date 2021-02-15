package nl.fatih.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "html:target/cucumberHtmlReport"},
        features = {"src/test/resources/features/"},
        tags = {"@iOSTraining"},
        glue = {"nl.fatih.stepDefinitions"}
)
public class AppiumiOSTrainingRunner {
}

