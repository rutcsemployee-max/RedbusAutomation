import browser.Browser;
import locators.Page1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static browser.Browser.driver;

public class MyTest {
    @Test
    void test1() throws InterruptedException {
        Browser.launch();
        Browser.navigate();
        Page1.locateFirst();
        Page1.sourceInput.sendKeys("Karunamoyee, Kolkata");
        Thread.sleep(3000);
        Page1.locateSrcFromList("Karunamoyee, Kolkata");
        Page1.srcFromList.click();
        Page1.destinationInput.sendKeys("Bardhaman");
        Page1.locateDestFromList("Bardhaman");
        Page1.destFromList.click();
        Page1.dateInput.click();
        Page1.locateSecond();
        Page1.rightArrow.click();
//        driver.findElement(By.xpath("//li[@role='gridcell']/div/div/span[.='3']")).click();
        Page1.locateDateListElement();
        Page1.dateElementFromList.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(Page1.searchButton)).click();
//        Page1.searchButton.click();
    }
}
