import browser.Browser;
import locators.Page1;
import locators.Page2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

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
        Page1.locateDateListElement(5);
        Page1.dateElementFromList.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(Page1.searchButton)).click();
//        Page1.searchButton.click();
        Page2.locateBus(4);
        Page2.slectedBus.click();
        Page2.locateSeat(5);
        Page2.selectedSeat.click();
        Page2.locateNextPageButton();
        Page2.button.click();
    }

    @Test
    public void testNow(){
        WebDriver d = new FirefoxDriver();
        d.get("https://www.redbus.in/search?fromCityName=Karunamoyee%2C%20Kolkata&toCityName=Bardhaman&fromCityId=75494&toCityId=74678&onward=03-Feb-2026&return=NaN-undefined-NaN&ref=modifyDate&step=SL#");
        WebElement slectedBus = new WebDriverWait(d, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-autoid='exact']/li[" + 1 + "]")));
        slectedBus.click();
//        d.findElement(By.xpath("//div[contains(@aria-label, 'seat status available')]"));
        List<WebElement> e = new WebDriverWait(d, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'seat status available')]")));
        Assert.assertNotNull(e);
        System.out.println(e.get(3).getText());
    }
}
