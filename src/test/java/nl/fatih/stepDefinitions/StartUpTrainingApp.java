package nl.fatih.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import nl.fatih.Platform.SessionType;
import nl.fatih.pageObjects.StartUpAppPageObject;
import nl.fatih.pageObjects.StartUpTrainingAppPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;


public class StartUpTrainingApp extends SessionType {
    StartUpTrainingAppPageObject startUpTrainingAppAppPageObjectAppPageObject = new StartUpTrainingAppPageObject();

    @Given("^I install the training \"([^\"]*)\" app on the emulator$")
    public void i_install_the_training_app_on_the_emulator(String platform) throws IOException {
        SessionType.getDriver(platform);
    }

    @Then("I see the training app in the iOS emulator")
    public void iSeeTheTrainingAppInTheIOSEmulator() {
        startUpTrainingAppAppPageObjectAppPageObject.getiOSLogo();
    }

    @Then("I see the text field")
    public void iSeeTheTextField() {
        startUpTrainingAppAppPageObjectAppPageObject.getTextView();
    }

    @Then("I see the text input field")
    public void iSeeTheTextInputField() {
        startUpTrainingAppAppPageObjectAppPageObject.getiOSTextInput();
    }

    @Then("I see the calculate button")
    public void iSeeTheCalculateButton() {
        startUpTrainingAppAppPageObjectAppPageObject.getiOSCalcButton();
    }

    @Then("I click on the calculate button")
    public void iClickOnTheCalculateButton() {
        driver.findElement(startUpTrainingAppAppPageObjectAppPageObject.getiOSCalcButton()).click();
    }

    @Then("I click on the popup")
    public void iClickOnThePopup() {
        driver.findElement(startUpTrainingAppAppPageObjectAppPageObject.getiOSPopup()).click();
    }
}
