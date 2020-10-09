package nl.fatih.pageObjects;

import helpers.Waiter;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartUpAppPageObject extends Waiter {
    private final By androidLogo = MobileBy.id("com.example.fatihtaxcalculator:id/imageView2");
    private final By androidPrice = MobileBy.id("com.example.fatihtaxcalculator:id/etPrice");
    private final By androidCountryList = MobileBy.id("android:id/text1");
    private final By androidCalcButton = MobileBy.id("com.example.fatihtaxcalculator:id/etCalculateTax");
    private final By androidTotal = MobileBy.id("com.example.fatihtaxcalculator:id/etResult");

    private final By iOSLogo = MobileBy.id("AppLabel");
    private final By iOSPrice = MobileBy.id("Price");
    private final By iOSButtonNL = MobileBy.id("taxNL");
    private final By iOSCalcButton = MobileBy.id("CALCULATE");
    private final By iOSTotal = MobileBy.id("TotalPrice");



    public By getAndroidLogo() {
        waitForPresence(androidLogo);
        return androidLogo;
    }

    public By getAndroidPrice() {
        waitForPresence(androidPrice);
        return androidPrice;
    }

    public By getAndroidCountryList() {
        waitForPresence(androidCountryList);
        return androidCountryList;
    }

    public By getAndroidCalcButton() {
        waitForPresence(androidCalcButton);
        return androidCalcButton;
    }

    public By getAndroidTotal() {
        waitForPresence(androidTotal);
        return androidTotal;
    }

    public By getiOSLogo() {
        waitForPresence(iOSLogo);
        return iOSLogo;
    }

    public By getiOSbuttonNL() {
        waitForPresence(iOSButtonNL);
        return iOSButtonNL;
    }

    public By getiOSPrice() {
        waitForPresence(iOSPrice);
        return iOSPrice;
    }

    public By getiOSCalcButton() {
        waitForPresence(iOSCalcButton);
        return iOSCalcButton;
    }

    public By getiOSTotal() {
        waitForPresence(iOSTotal);
        return iOSTotal;
    }
}
