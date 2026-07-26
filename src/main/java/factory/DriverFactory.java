package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeDriver() {

        String browser = ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());
                break;

            default:
                throw new RuntimeException("Invalid Browser Name : " + browser);
        }

        driver.get().manage().window().maximize();

        driver.get().manage().timeouts().implicitlyWait(
                Duration.ofSeconds(
                        Long.parseLong(
                                ConfigReader.getProperty("implicitWait"))));

        driver.get().manage().timeouts().pageLoadTimeout(
                Duration.ofSeconds(
                        Long.parseLong(
                                ConfigReader.getProperty("pageLoadTimeout"))));

        driver.get().get(ConfigReader.getProperty("url"));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}