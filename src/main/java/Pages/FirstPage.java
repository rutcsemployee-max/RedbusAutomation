package Pages;
import browser.Browser;
import browser.ConfigReader;
import locators.Page1;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;


public class FirstPage extends Browser {

    public static void firstPage() {
        Page1.locateFirst();
        Page1.sourceInput.sendKeys("Karunamoyee, Kolkata");
        Page1.locateSrcFromList("Karunamoyee, Kolkata");
        Page1.srcFromList.click();
        Page1.destinationInput.sendKeys("Bardhaman");
        Page1.locateDestFromList("Bardhaman");
        Page1.destFromList.click();
        Page1.dateInput.click();
        boolean useFutureDate = Boolean.parseBoolean(ConfigReader.get("futureDate"));
        if(useFutureDate) {
            Page1.locateSecond();
            Page1.rightArrow.click();
        }
        else{
            Page1.locateDateListElement(Integer.parseInt((LocalDate.now()+"").split("-")[2]));
        }
        Page1.dateElementFromList.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(Page1.searchButton)).click();

    }

}
