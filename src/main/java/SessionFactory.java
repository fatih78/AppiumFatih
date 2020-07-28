import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class SessionFactory {
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/fatihtopcuoglu/AndroidStudioProjects/FatihTaxCalculator/app/build/outputs/apk/release/app-release-unsigned.apk");

        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } finally {
            new Thread(new SessionClean.SessionCleanUp());
        }
        return driver;

    }
}
