package locators;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page1 extends Browser {
	public static WebElement sourceInput, destinationInput, date, rightarrow, searchButton;

	public static void locate() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		sourceInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='srcinput']")));
		destinationInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='destinput']")));
		date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dateInputWrapper___c59b4e dateHighlight___647069']")));
		searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='srcinput']")));

	}
	
}
