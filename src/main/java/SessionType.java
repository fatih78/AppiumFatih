import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.IOException;

public class SessionType {
    public static AppiumDriver<MobileElement> driver;
    private static final String PLATFORM_NAME = "platform";

    public static AppiumDriver<MobileElement> getDriver() throws IOException {

        if (driver == null) {
            String platform = System.getProperty(PLATFORM_NAME);
            if (platform == null) {
                platform = "Android";
            }
            // Expand with supported browsers
            switch (platform) {
                case "Android":
                    driver = SessionFactory.getAndroid();
                    break;
                case "iOS":
                    driver = SessionFactory.getiOS();
                    break;
            }
            return driver;
        }
        return driver;
    }

}




