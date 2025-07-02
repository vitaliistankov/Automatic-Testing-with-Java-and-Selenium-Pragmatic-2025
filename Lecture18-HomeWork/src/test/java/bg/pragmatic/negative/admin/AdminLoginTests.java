package bg.pragmatic.negative.admin;

import bg.pragmatic.base.BaseTest;
import bg.pragmatic.pages.admin.AdminLogin;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin() {
        AdminLogin.open();
        AdminLogin.login("afjaslkjdf", "asdfasfdasf");
        AdminLogin.verifyLoginFormValidationMessage("No match for Username and/or Password.",
                "the validation message 'No match for Username and/or Password.' was not present");
    }
}
