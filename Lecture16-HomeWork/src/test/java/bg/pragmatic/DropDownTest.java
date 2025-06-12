package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropDownTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://auto.pragmatic.bg/manage");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void TestDropDown() {

        WebElement usernameField = driver.findElement(By.id("input-username"));
        WebElement passwordField = driver.findElement(By.id("input-password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameField.sendKeys("admin");
        passwordField.sendKeys("parola123!");
        loginButton.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println(driver.getTitle());

        String salesXpath = "//*[@id='menu-sale']/a";
        WebElement salesMenu = driver.findElement(By.xpath(salesXpath));
        salesMenu.click();

        String ordersXpath = "//*[@id='collapse-4']/li[1]/a";
        WebElement ordersLink = driver.findElement(By.xpath(ordersXpath));
        ordersLink.click();

//       String statusXpath = "//div[4]//select";
//        WebElement dropDown = driver.findElement(By.xpath(statusXpath));
        WebElement dropDown = driver.findElement(By.id("input-order-status"));
        Select orderStatusSelect = new Select(dropDown);

        List<String> exp_options = Arrays.asList(new String[]{"","Missing Orders", "Canceled", "Canceled Reversal",
                "Chargeback", "Complete", "Denied", "Expired", "Failed", "Pending", "Processed", "Processing",
                "Refunded", "Reversed", "Shipped", "Voided"});
        List<String> act_options = new ArrayList<String>();

        List<WebElement> allOptions = orderStatusSelect.getOptions();

        for(WebElement option : allOptions) {
            act_options.add(option.getText());
        }

        assertEquals(act_options, exp_options);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
