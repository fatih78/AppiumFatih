package nl.fatih.Platform;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class SessionFactory {
    public static AppiumDriver driver = null;
    static AndroidDriver androidDriver = (AndroidDriver) driver;
    static AndroidDriver androidDriver2 = (AndroidDriver) driver;
    static IOSDriver iosDriver = (IOSDriver) driver;

    public static AppiumDriver<MobileElement> getAndroid() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
        capabilities.setCapability(PLATFORM_NAME, "android");
        capabilities.setCapability("appPackage", "com.example.fatihtaxcalculator"); // To start the the app skipping splashscreen
        capabilities.setCapability("appActivity","com.example.fatihtaxcalculator.MainActivity");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");

//        capabilities.setCapability(MobileCapabilityType.APP, "/Users/fatihtopcuoglu/AndroidStudioProjects/FatihTaxCalculator/app/build/outputs/apk/debug/app-debug.apk");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/fatihtopcuoglu/Projects/FatihTaxCalculator2/app/build/outputs/apk/release/app-release-unsigned.apk");
        androidDriver = new AndroidDriver(url, capabilities);
        return androidDriver;
    }

//    For testing splashscreen > capabilities.setCapability("appActivity","com.example.fatihtaxcalculator.SplashScreen");
    public static AppiumDriver<MobileElement> getAndroid2() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        capabilities.setCapability(PLATFORM_NAME, "android");
        capabilities.setCapability("appPackage", "com.example.fatihtaxcalculator"); // To start the the app skipping splashscreen
        capabilities.setCapability("appActivity","com.example.fatihtaxcalculator.SplashScreen");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/fatihtopcuoglu/Projects/FatihTaxCalculator2/app/build/outputs/apk/release/app-release-unsigned.apk");
        androidDriver2 = new AndroidDriver(url, capabilities);
        return androidDriver2;
    }

    public static IOSDriver getiOS() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "11.4");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("udid", "60DA8FD3-EBAE-4EC5-98D2-EEB6617CDE61");
        capabilities.setCapability("app", "/Users/fatihtopcuoglu/Library/Developer/Xcode/DerivedData/SalesTax-bvatxoukkuazmjdxmzmstiuzutva/Build/Products/Release-iphonesimulator/SalesTax.app");
        iosDriver = new IOSDriver(url, capabilities);
        return iosDriver;

       // /Users/fatihtopcuoglu/Library/Developer/Xcode/DerivedData/ReferenceiOS-fqcxnjkwfmizmkbipjpvfjditoro/Build/Products/Debug-iphonesimulator/ReferenceiOS.app

    }

    public static IOSDriver getiOSTraining() throws IOException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.4");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("udid", "2B39BB66-823F-437F-A43B-DDD7299ECFC7");
        capabilities.setCapability("noReset", true);
//        capabilities.setCapability("fullReset", true);
        capabilities.setCapability("app", "/Users/fatihtopcuoglu/Library/Developer/Xcode/DerivedData/ReferenceiOS-fqcxnjkwfmizmkbipjpvfjditoro/Build/Products/Debug-iphonesimulator/ReferenceiOS.app");
        iosDriver = new IOSDriver(url, capabilities);
        return iosDriver;

    }
}
