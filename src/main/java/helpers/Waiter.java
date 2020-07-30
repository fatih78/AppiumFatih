package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import nl.fatih.Platform.SessionType;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    public static MobileElement mobileElement;
    AppiumDriver<MobileElement> driver;

    public void waitForPresence(By locator){
        boolean isElementPresent;
        try{
            mobileElement =  (MobileElement) driver.findElement(locator);
            WebDriverWait wait = new WebDriverWait(driver, 40);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            isElementPresent = mobileElement.isDisplayed();
            Assert.assertTrue(isElementPresent);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
