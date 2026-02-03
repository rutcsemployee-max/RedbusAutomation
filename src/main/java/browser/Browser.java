package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static WebDriver driver;

    public static void launch() {
        String browser = ConfigReader.get("browser").toLowerCase();

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            default:
                throw new RuntimeException(
                        "Unsupported browser: " + browser
                );
        }

        driver.manage().window().maximize();
    }

    public static void navigate() {
        String url = ConfigReader.get("url");
        driver.get(url);
    }

    public static void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
