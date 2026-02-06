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
    public static WebElement selectedBus, selectedSeat, button;
            public static List<WebElement> totalSeats, availableSeats;

    public static void locateBus(int nThBus){
        selectedBus = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-autoid='exact']/li["+nThBus+"]")));
    }

    public static void locateSeat(int nThSeat) {
        totalSeats = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'Seat number')]")));
        availableSeats = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'seat status available')]")));
        selectedSeat = Objects.requireNonNull(new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label, 'seat status available')]")))).get(nThSeat);
    }
    public static void locateNextPageButton(){
        button = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Select boarding & dropping points']")));
    }

}
