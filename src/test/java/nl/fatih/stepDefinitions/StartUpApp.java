package nl.fatih.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import nl.fatih.Platform.SessionType;
import nl.fatih.pageObjects.StartUpAppPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

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

    @Then("I enter the Android price for two countries")
    public void iEnterTheAndroidPriceForTwoCountries() {
        driver.findElement(startUpAppPageObject.getAndroidPrice()).sendKeys("200");
        driver.findElement(startUpAppPageObject.getAndroidPrice2()).sendKeys("200");
    }

    @Then("I select {string} country list")
    public void iSelectCountryList(String list) {
        switch (list) {
            case "first":
                driver.findElement(startUpAppPageObject.getAndroidCountryList()).click();
                break;
            case "second":
                driver.findElement(startUpAppPageObject.getAndroidCountryList2()).click();
        }
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

    @Then("the second Android amount is equal to {string}")
    public void theSecondAndroidAmountIsEqualTo(String amount) {
        Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidTotal2()).getText().contains(amount));

    }

    @Then("the {string} Android amount is equal to {string}")
    public void theAndroidAmountIsEqualTo(String order, String amount) {
        switch (order) {
            case "first":
                Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidTotal()).getText().contains(amount));
                break;
            case "second":
                Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidTotal2()).getText().contains(amount));
                break;
        }
    }

    @Then("the difference is {string}")
    public void theDifferenceIs(String diff) {
        Assert.assertTrue(driver.findElement(startUpAppPageObject.getAndroidDifference()).getText().contains(diff));
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

    @Then("the difference is {int}")
    public void theDifferenceIs(int number) {

    }

}
