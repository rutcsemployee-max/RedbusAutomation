package locators;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Page2 extends Browser {
    public static WebElement slectedBus, selectedSeat, button;

    public static void locateBus(int nThBus){
        //ul[@data-autoid='exact']/li[5]
        slectedBus = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-autoid='exact']/li["+nThBus+"]")));

    }

    public static void locateSeat(int nThSeat) {
        selectedSeat = Objects.requireNonNull(new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'seat status available')]")))).get(nThSeat);
    }
    public static void locateNextPageButton(){
        //button[@aria-label='Select boarding & dropping points']
        button = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Select boarding & dropping points']")));
    }

}
