package nl.fatih.pageObjects;

import helpers.Waiter;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartUpAppPageObject extends Waiter {
    private final By androidLogo = MobileBy.id("com.example.fatihtaxcalculator:id/imageView2");
    private final By androidPrice = MobileBy.id("com.example.fatihtaxcalculator:id/etPrice");
    private final By androidPrice2 = MobileBy.id("com.example.fatihtaxcalculator:id/etPrice2");
    private final By androidCountryList = MobileBy.id("com.example.fatihtaxcalculator:id/spinner");
    private final By androidCountryList2 = MobileBy.id("com.example.fatihtaxcalculator:id/spinner2");
    private final By androidCalcButton = MobileBy.id("com.example.fatihtaxcalculator:id/etCalculateTax");
    private final By androidTotal = MobileBy.id("com.example.fatihtaxcalculator:id/etResult");
    private final By androidTotal2 = MobileBy.id("com.example.fatihtaxcalculator:id/etResult2");
    private final By androidFlag = MobileBy.id("com.example.fatihtaxcalculator:id/image_view_assets");
    private final By androidDifference = MobileBy.id("com.example.fatihtaxcalculator:id/etDifference");

    private final By iOSLogo = MobileBy.id("AppLabel");
    private final By iOSPrice = MobileBy.id("Price");
    private final By iOSButtonNL = MobileBy.id("taxNL");
    private final By iOSCalcButton = MobileBy.id("CALCULATE");
    private final By iOSTotal = MobileBy.id("TotalPrice");


    public By getAndroidDifference() {
        waitForPresence(androidDifference);
        return androidDifference;
    }

    public By getAndroidFlag() {
        waitForPresence(androidFlag);
        return androidFlag;
    }

    public By getAndroidLogo() {
        waitForPresence(androidLogo);
        return androidLogo;
    }

    public By getAndroidPrice() {
        waitForPresence(androidPrice);
        return androidPrice;
    }

    public By getAndroidPrice2() {
        waitForPresence(androidPrice2);
        return androidPrice2;
    }

    public By getAndroidCountryList() {
        waitForPresence(androidCountryList);
        return androidCountryList;
    }

    public By getAndroidCountryList2() {
        waitForPresence(androidCountryList2);
        return androidCountryList2;
    }

    public By getAndroidCalcButton() {
        waitForPresence(androidCalcButton);
        return androidCalcButton;
    }

    public By getAndroidTotal() {
        waitForPresence(androidTotal);
        return androidTotal;
    }

    public By getAndroidTotal2() {
        waitForPresence(androidTotal2);
        return androidTotal2;
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
