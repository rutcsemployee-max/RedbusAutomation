package tests;

import Pages.FirstPage;
import Pages.SecondPage;
import browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

    @BeforeTest
    void initialize(){
        Browser.launch();
        Browser.navigate();
    }

    @Test
    void test1() throws InterruptedException {
        FirstPage.firstPage();
    }

    @Test
    void test2(){
        SecondPage.secondPage();
    }

    @AfterTest
    void endTests(){
        Browser.close();
    }

//    @Test
//    public void testNow(){
//        WebDriver d = new FirefoxDriver();
//        d.get("https://www.redbus.in/search?fromCityName=Karunamoyee%2C%20Kolkata&toCityName=Bardhaman&fromCityId=75494&toCityId=74678&onward=03-Feb-2026&return=NaN-undefined-NaN&ref=modifyDate&step=SL#");
//        WebElement slectedBus = new WebDriverWait(d, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-autoid='exact']/li[" + 1 + "]")));
//        slectedBus.click();
////        d.findElement(By.xpath("//div[contains(@aria-label, 'seat status available')]"));
//        List<WebElement> e = new WebDriverWait(d, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'seat status available')]")));
//        Assert.assertNotNull(e);
//        System.out.println(e.get(3).getText());
//    }
}
