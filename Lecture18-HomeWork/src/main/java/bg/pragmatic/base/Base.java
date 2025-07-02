package bg.pragmatic.base;


import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    private static Duration TIMEOUT_10_SECONDS = Duration.ofSeconds(10);
    private static Duration TIMEOUT_0_SECONDS = Duration.ofSeconds(0);

    protected static void type(By locator, String whatToType) {
        Browser.driver.findElement(locator).sendKeys(whatToType);
    }

    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
   }

   protected static String getText(By locator) {
       return Browser.driver.findElement(locator).getText();
   }

   protected static WebElement waitForElementVisibility(By locator) {
       Browser.driver.manage().timeouts().implicitlyWait(TIMEOUT_0_SECONDS);
       WebDriverWait wait = new WebDriverWait(Browser.driver, TIMEOUT_10_SECONDS);
       WebElement foundVisibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       Browser.driver.manage().timeouts().implicitlyWait(TIMEOUT_10_SECONDS);
       return foundVisibleElement;
   }
}
