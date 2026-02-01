package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	
	public static void launch() {
		driver = new FirefoxDriver();
	}
	
	public static void navigate(String url) {
		driver.get(url);
	}
	
	public static void close() {
		driver.quit();
	}
}
