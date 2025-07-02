package bg.pragmatic.pages.admin;

import bg.pragmatic.base.Base;
import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminLogin extends Base {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By POPPING_UP_LOGIN_FORM_VALIDATION_MESSAGE = By.cssSelector(".alert-danger");

    /**
     * Opens the admin login area of auto.pragmatic.bg/manage
     */
    public static void open() {
        Browser.driver.get("http://auto.pragmatic.bg/manage");
    }

    /**
     * Logs into the admin area of auto.pragmatic.bg/manage with the
     * provided credentials as arguments
     *
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        waitForElementVisibility(USERNAME_INPUT_FIELD);
        type(USERNAME_INPUT_FIELD, username);
        waitForElementVisibility(PASSWORD_INPUT_FIELD);
        type(PASSWORD_INPUT_FIELD, password);
        waitForElementVisibility(LOGIN_BUTTON);
        click(LOGIN_BUTTON);
    }

    /**
     * Asserts that the validation message that appears based on wrongly provided
     * credentials is as expected
     *
     * @param expectedLoginFormValidationMessage the expected login form validation message
     * @param messageOnTestAssertFailure the message that will appear you in your test reports in case of assert failure
     */
    public static void verifyLoginFormValidationMessage(String expectedLoginFormValidationMessage, String messageOnTestAssertFailure) {
        String actualLoginFormValidationMessage = getText(POPPING_UP_LOGIN_FORM_VALIDATION_MESSAGE);
        Assert.assertTrue(actualLoginFormValidationMessage.contains(expectedLoginFormValidationMessage), messageOnTestAssertFailure);
    }
}
