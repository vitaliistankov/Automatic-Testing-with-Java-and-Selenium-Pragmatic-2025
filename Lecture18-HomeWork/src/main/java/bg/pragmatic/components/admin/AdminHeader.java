package bg.pragmatic.components.admin;

import bg.pragmatic.base.Base;
import bg.pragmatic.utils.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminHeader extends Base {

    private static final By LOGGED_USER_FULL_NAME_IN_HEADER = By.cssSelector("#nav-profile .nav-link span");

    /**
     * Asserts that the full name you see for the user that is logged into the admin area
     * is as we expect it to be
     *
     * @param expectedLoggedUserFullName the full name that you expect to be present on top of the screen in the header of the logged user
     * @param messageOnTestAssertFailure the message that will appear in you test reports in case of assert failure
     */
    public static void verifyLoggedUserFullName(String expectedLoggedUserFullName, String messageOnTestAssertFailure) {
        String actualLoggedUserFullName = getText(LOGGED_USER_FULL_NAME_IN_HEADER);
        Assert.assertTrue(actualLoggedUserFullName.contains(expectedLoggedUserFullName), messageOnTestAssertFailure);
    }
}
