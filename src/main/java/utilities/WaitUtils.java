package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static WebElement waitForVisible(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForPresence(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean waitForText(WebDriver driver,
                                      By locator,
                                      String text) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        return wait.until(
                ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
}