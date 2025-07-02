package bg.pragmatic.pages.admin;

import bg.pragmatic.utils.MyBrowser;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAdminLogin {
    /**
     * Opens the admin area
     */
    public static void myOpen() {
        MyBrowser.driver.get("https://auto.pragmatic.bg/manage/");
    }

    /**
     * Logs to the admin area
     *
     * @param username
     * @param password
     */

    public static void myLogin(String username, String password) {
        MyBrowser.driver.findElement(By.id("input-username")).sendKeys(username);
        MyBrowser.driver.findElement(By.id("input-password")).sendKeys(password);
        MyBrowser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    /**
     * Asserts that the validation message that appears based on wrongly provided credentials
     * is as expected
     *
     * @param expectedLoginFormValidationMessage the expected login form validation message
     * @param messageOnTestAssertFailure the message that will appear in your test reports in case of assert failure
     */

    public static void verifyLoginFormValidationMessage(String expectedLoginFormValidationMessage, String messageOnTestAssertFailure) {
        String actualLoginFormValidationMessage = MyBrowser.driver.findElement(By.cssSelector(".alert-danger")).getText();
        Assert.assertTrue(actualLoginFormValidationMessage.contains(expectedLoginFormValidationMessage), messageOnTestAssertFailure);
    }
}
