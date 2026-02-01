import browser.Browser;
import locators.Page1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static browser.Browser.driver;

public class MyTest {
    @Test
    void test1() throws InterruptedException {
        Browser.launch();
        Browser.navigate("https://www.redbus.in");
        Page1.locate();
        Page1.sourceInput.sendKeys("Karunamoyee, Kolkata");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[.='Karunamoyee, Kolkata']")).click();
        Page1.destinationInput.sendKeys("Bardhaman");
    }
}
