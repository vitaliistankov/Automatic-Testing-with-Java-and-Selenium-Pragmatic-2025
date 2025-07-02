package bg.pragmatic.base;

import bg.pragmatic.pages.admin.MyAdminLogin;
import org.testng.annotations.Test;

public class MyBase {

    @Test
    public void unsuccesfulLogin(){
        MyAdminLogin.myOpen();
        MyAdminLogin.myLogin("jdsnkfkfdm", "sdfnkfks");
        MyAdminLogin.verifyLoginFormValidationMessage(" No match for Username and/or Password.",
                "The validation message was not present");

    }
}
