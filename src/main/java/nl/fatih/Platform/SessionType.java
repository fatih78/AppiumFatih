package nl.fatih.Platform;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class SessionType {

//    /* Static 'instance' method */
//    private static SessionType singleton = new SessionType();
//    private SessionType() { }
//    public static SessionType getInstance() {
//        return singleton;
//    }

    public static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> getDriver(String platform) throws IOException {


        if (platform == null) {
            platform = "Android";
        }
        // Expand with supported browsers
        switch (platform) {
            case "Android":
                driver = SessionFactory.getAndroid();
                break;
            case "AndroidSplash":
                driver = SessionFactory.getAndroid2();
                break;
            case "iOS":
                driver = SessionFactory.getiOS();
                break;
        }
        return driver;
    }

}




