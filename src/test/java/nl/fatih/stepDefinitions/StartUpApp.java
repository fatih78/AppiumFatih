package nl.fatih.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import nl.fatih.Platform.SessionType;
import nl.fatih.pageObjects.StartUpAppPageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class StartUpApp extends SessionType {
    StartUpAppPageObject startUpAppPageObject = new StartUpAppPageObject();

    @Given("^I install the \"([^\"]*)\" app on the emulator$")
    public void i_install_the_app_on_the_emulator(String platform) throws IOException {
        SessionType.getDriver(platform);
    }

    @Then("^I see the app in the Android emulator$")
    public void i_see_the_app_in_the_android_emulator() throws IOException {
        startUpAppPageObject.getAndroidLogo();
    }

    @Then("I enter the Android price")
    public void iEnterTheAndroidPrice() {
        driver.findElement(startUpAppPageObject.getAndroidPrice()).sendKeys("200");
    }

    @Then("I click button Android NL")
    public void iClickButtonAndroidNL() throws IOException {
        driver.findElement(startUpAppPageObject.getAndroidbuttonNL()).click();
    }

    @Then("I click on the Android calculate button")
    public void iClickOnTheAndroidCalculateButton() {
        driver.findElement(startUpAppPageObject.getAndroidCalcButton()).click();
    }

    @Then("the Android amount is equal to {string}")
    public void theAndroidAmountIsEqualTo(String amount) {
        Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidTotal()).getText().contains(amount));
    }

    @Then("I see the app in the iOS emulator")
    public void iSeeTheAppInTheIOSEmulator() {
        startUpAppPageObject.getiOSLogo();
    }

    @Then("I enter the iOS price")
    public void iEnterTheIOSPrice() {
        driver.findElement(startUpAppPageObject.getiOSPrice()).sendKeys("200");
    }

    @Then("I click button iOS NL")
    public void iClickButtonIOSNL() throws InterruptedException {
        driver.findElement(startUpAppPageObject.getiOSbuttonNL()).click();
    }

    @Then("I click on the iOS calculate button")
    public void iClickOnTheIOSCalculateButton() {
        driver.findElement(startUpAppPageObject.getiOSCalcButton()).click();
    }


    @Then("the iOS amount is equal to {string}")
    public void theIOSAmountIsEqualTo(String amount) {
//        Another way of the assertion = more strict
//        Assert.assertTrue(driver.findElement(startUpAppPageObject.getiOSTotal()).getText().contains(amount));
        WebElement uiElement = driver.findElement(startUpAppPageObject.getiOSTotal());
        String text = uiElement.getText();
        Assert.assertTrue(text.contentEquals(amount));
    }
}
