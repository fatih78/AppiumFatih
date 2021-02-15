package nl.fatih.pageObjects;

import helpers.Waiter;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class StartUpTrainingAppPageObject extends Waiter {

    private final By iOSPopup = MobileBy.id("OK");
    private final By textView = MobileBy.id("textview");
    private final By iOSCalcButton = MobileBy.id("calculatebutton");
    private final By iOSTextInput = MobileBy.id("textinput");
    private final By iOSLogo = MobileBy.id("AppLabel");




    public By getTextView() {
        return textView;
    }

    public By getiOSPopup() {
        return iOSPopup;
    }

    public By getiOSCalcButton() {
        waitForPresence(iOSCalcButton);
        return iOSCalcButton;
    }

    public By getiOSTextInput() {
        return iOSTextInput;
    }


    public By getiOSLogo() {
        waitForPresence(iOSLogo);
        return iOSLogo;
    }

}
