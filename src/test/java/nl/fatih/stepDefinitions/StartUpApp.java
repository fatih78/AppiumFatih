package nl.fatih.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import nl.fatih.Platform.*;

import java.io.IOException;


public class StartUpApp extends SessionType {

    @Given("^I install the \"([^\"]*)\" app on the emulator$")
    public void i_install_the_app_on_the_emulator(String platform) throws IOException {
        SessionType.getDriver(platform);
    }

    @Then("^I see the app in the emulator$")
    public void i_see_the_app_in_the_emulator() throws Throwable {
        throw new PendingException();
    }
}
