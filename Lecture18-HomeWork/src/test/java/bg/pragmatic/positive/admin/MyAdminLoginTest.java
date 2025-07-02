package bg.pragmatic.positive.admin;

import bg.pragmatic.components.admin.MyAdminHeader;
import bg.pragmatic.pages.admin.MyAdminLogin;
import bg.pragmatic.utils.Browser;
import bg.pragmatic.utils.MyBrowser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAdminLoginTest {

    @BeforeMethod
    public void setup() {
        MyBrowser.myOpen();
    }

    @Test
    public void successfullLogin() {

        MyAdminLogin.myOpen();
        MyAdminLogin.myLogin("admin", "parola123!");
        MyAdminHeader.myVerifyLoggedUserFullName("John Doe",
                "You are unable to login successfully");

    }

    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }
}
