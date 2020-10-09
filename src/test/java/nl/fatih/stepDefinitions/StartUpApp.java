package nl.fatih.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import nl.fatih.Platform.SessionType;
import nl.fatih.pageObjects.StartUpAppPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;


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

    @Then("I select country list")
    public void iSelectCountryList() throws IOException {
        driver.findElement(startUpAppPageObject.getAndroidCountryList()).click();

    }

    @Then("I select {string} as country")
    public void iSelectAsCountry(String country) {

        switch (country) {
            case "NL":
                MobileElement list = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"NL\"));"));
                list.click();
                break;
            case "FR":
                MobileElement list2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"FR\"));"));
                list2.click();
                break;
            default:
                System.out.println("No Country selected");
        }
    }

    @Then("I see the flag")
    public void iSeeTheFlag() {
        startUpAppPageObject.getAndroidLogo();
    }


    @Then("I click on the Android calculate button")
    public void iClickOnTheAndroidCalculateButton() {
        driver.findElement(startUpAppPageObject.getAndroidCalcButton()).click();
    }

    @Then("the Android amount is equal to {string}")
    public void theAndroidAmountIsEqualTo(String amount) {
        Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidTotal()).getText().contains(amount));
    }

    @Given("I install the {string} app on the emulator with splashScreen")
    public void iInstallTheAppOnTheEmulatorWithSplashScreen(String platform) throws IOException {
        SessionType.getDriver(platform);
    }

    @Then("I see the splashscreen")
    public void iSeeTheSplashscreen() {
    }

    @Then("I see the app in the iOS emulator")
    public void iSeeTheAppInTheIOSEmulator() {
        startUpAppPageObject.getiOSLogo();
    }

    @Then("I enter the iOS price {string}")
    public void iEnterTheIOSPrice(String price) {
        driver.findElement(startUpAppPageObject.getiOSPrice()).sendKeys(price);
    }

    @Then("I select listitem iOS {string}")
    public void iSelectListitemIOS(String country) {
        driver.findElement(By.xpath("//XCUIElementTypePicker[1]//XCUIElementTypePickerWheel[1]")).sendKeys(country);
    }

    @Then("I click on the iOS calculate button")
    public void iClickOnTheIOSCalculateButton() {
        driver.findElement(startUpAppPageObject.getiOSCalcButton()).click();
    }


    @Then("the iOS amount is equal to {string}")
    public void theIOSAmountIsEqualTo(String amount) {
//        Another way of the assertion = more strict
        Assert.assertTrue(driver.findElement(startUpAppPageObject.getiOSTotal()).getText().contains(amount));
//        WebElement uiElement = driver.findElement(startUpAppPageObject.getiOSTotal());
//        String text = uiElement.getText();
//        Assert.assertTrue(text.contentEquals(amount));
    }
}
