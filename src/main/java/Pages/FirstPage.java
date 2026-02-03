package Pages;
import locators.Page1;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static browser.Browser.driver;

public class FirstPage {

    public static void firstPage() throws InterruptedException {
        Page1.locateFirst();
        Page1.sourceInput.sendKeys("Karunamoyee, Kolkata");
        Page1.locateSrcFromList("Karunamoyee, Kolkata");
        Page1.srcFromList.click();
        Page1.destinationInput.sendKeys("Bardhaman");
        Page1.locateDestFromList("Bardhaman");
        Page1.destFromList.click();
        Page1.dateInput.click();
        Page1.locateSecond();
        Page1.rightArrow.click();
        Page1.locateDateListElement(5);
        Page1.dateElementFromList.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(Page1.searchButton)).click();

    }

}
