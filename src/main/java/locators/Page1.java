package locators;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page1 extends Browser {
	public static WebElement sourceInput, destinationInput, dateInput, rightArrow, searchButton, srcFromList, destFromList, dateElementFromList;

	public static void locateFirst() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		sourceInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='srcinput']")));
		destinationInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='destinput']")));
		dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-autoid='searchWidget']/div[1]/div[1]/div[3]")));
		searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-autoid='searchWidget']/button")));
	}

	public static void locateSecond() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		rightArrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-autoid='searchWidget']/div[2]/div/div/div/div/div/i[2]")));
	}
	public static void locateSrcFromList(String src){
		srcFromList = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='"+src+"']")));
	}

	public static void locateDestFromList(String dest){
		destFromList = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[.='"+dest+"']")));
	}

	public static void locateDateListElement(int dateToBeSelected){
	dateElementFromList	= new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@role='gridcell']/div/div/span[.='"+dateToBeSelected+"']")));

	}

}
