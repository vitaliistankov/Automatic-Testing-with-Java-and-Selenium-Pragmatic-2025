package bg.pragmatic.positive.admin;

import bg.pragmatic.base.BaseTest;
import bg.pragmatic.components.admin.AdminHeader;
import bg.pragmatic.pages.admin.AdminLogin;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {


    @Test
    public void successfulLogin() {
        AdminLogin.open();
        AdminLogin.login("admin", "parola123!");
        AdminHeader.verifyLoggedUserFullName(
                "John Doe",
                "you were unable to login successfully");
    }




}
