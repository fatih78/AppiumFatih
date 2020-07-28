import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BasicTest extends SessionFactory {

        public static void main(String[] args) throws MalformedURLException
        {
            driver = capabilities();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.id("com.example.fatihtaxcalculator:id/imageView2"));
        }
}
