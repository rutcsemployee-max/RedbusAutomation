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
		dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dateInputWrapper___c59b4e dateHighlight___647069']")));
		searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='primaryButton___5380e6 searchButtonWrapper___2d58a0 ']")));
	}

	public static void locateSecond() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		rightArrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon icon-arrow arrow___d574fb right___8f9055 ']")));
	}
	public static void locateSrcFromList(String src){
		srcFromList = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[.='"+src+"']")));
	}

	public static void locateDestFromList(String dest){
		destFromList = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[.='"+dest+"']")));
	}

	public static void locateDateListElement(){
	dateElementFromList	= new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@role='gridcell']/div/div/span[.='3']")));
	}

}
