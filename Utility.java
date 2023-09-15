package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Testbase.WebTestBase.driver;

public class Utility {
    public static final long IMPLICIT_WAIT =20;
    public static final long PAGE_LOAD =20;
    public static final long EXPLICIT_WAIT =20;
    public static WebDriverWait wait;

    public static void waitUntilElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public static void explicitWaitForElement(WebElement mobile) {
    }
}