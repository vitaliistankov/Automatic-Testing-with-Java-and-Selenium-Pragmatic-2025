package bg.pragmatic.components.admin;

import bg.pragmatic.utils.MyBrowser;
import org.openqa.selenium.By;
import org.testng.Assert;

import static bg.pragmatic.utils.MyBrowser.driver;

public class MyAdminHeader {
    /**
     * Asserts that the full name you see for the user that is logged into the admin area  as we expect to be
     * @param expectedLoggedUserFullName the full name that you expect to be present at the top of the screen in the header of the logged user
     * @param messageOnTestAssertFailure the message that will appear in your test reports in case of assert failure
     */
    public static void myVerifyLoggedUserFullName(String expectedLoggedUserFullName, String messageOnTestAssertFailure)     {

        String actualLoggedUserFullName = MyBrowser.driver.findElement(By.cssSelector("#nav-profile .nav-link span")).getText();
        Assert.assertTrue(actualLoggedUserFullName.contains(expectedLoggedUserFullName), messageOnTestAssertFailure);
    }

    public static void quit(){
        driver.quit();
    }
}
