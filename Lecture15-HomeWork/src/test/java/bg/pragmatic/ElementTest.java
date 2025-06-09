package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementTest {
    private WebDriver driver;


    @BeforeClass
    public void setUp() {
        this.driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get("http://auto.pragmatic.bg/manage");


    }

    @Test
    public void testSuccessfulLogin() {

        WebElement usernameField = driver.findElement(By.id("input-username"));
        WebElement passwordField = driver.findElement(By.id("input-password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));


        usernameField.sendKeys("admin");
        passwordField.sendKeys("parola123!");
        loginButton.click();

        // Assert login success by checking for a post-login element
//        WebElement dashboardStatsElement = driver.findElement(By.id("stats"));
        WebElement dashboardElement = driver.findElement(By.id("container"));
        Assert.assertTrue(dashboardElement.isDisplayed(), "Dashboard should be visible after successful login.");
    }

    @AfterClass
    public void tearDown() {
//        this.driver.quit();
    }

}
