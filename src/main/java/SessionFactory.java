import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class SessionFactory {
    public static AppiumDriver driver = null;
    static AndroidDriver androidDriver = (AndroidDriver) driver;
    static IOSDriver iosDriver = (IOSDriver) driver;

    public static AppiumDriver<MobileElement> getAndroid() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
            capabilities.setCapability(PLATFORM_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            capabilities.setCapability(MobileCapabilityType.APP, "/Users/fatihtopcuoglu/AndroidStudioProjects/FatihTaxCalculator/app/build/outputs/apk/release/app-release-unsigned.apk");
            driver = new AndroidDriver<MobileElement>(url, capabilities);

        } finally {
            driver.quit();
        }
        return androidDriver;
    }

    public static IOSDriver getiOS() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "11.4");
            capabilities.setCapability("deviceName", "iPhone 8");
            capabilities.setCapability("udid", "C929F924-F11C-4D88-B288-865B91A692C7");
            capabilities.setCapability("app", "/Users/fatihtopcuoglu/Library/Developer/Xcode/DerivedData/SalesTax-aqqsmugfmohjnchfgwvizfhgwrvn/Build/Products/Release-iphonesimulator/SalesTax.app");
            driver = new IOSDriver<MobileElement>(url, capabilities);

        } finally {
            driver.quit();
        }
        return iosDriver;
    }
}
