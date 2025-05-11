
// Да се създаде abstract-ен клас AbstractUser, който е User

import java.util.Date;

public abstract class AbstractUser implements User {
    private String username;
    protected boolean loggedIn;
    protected Date registrationDate;

    public AbstractUser(String username) {
        this.username = username;
        this.loggedIn = false;
        this.registrationDate = new Date();
    }
    @Override
    public void logIn() {
        loggedIn = true;
        System.out.println(username + " logged in.");
    }

    @Override
    public void logOut() {
        loggedIn = false;
        System.out.println(username + " logged out.");
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getRegistrationDate() {
        return registrationDate.toString();
    }
}


