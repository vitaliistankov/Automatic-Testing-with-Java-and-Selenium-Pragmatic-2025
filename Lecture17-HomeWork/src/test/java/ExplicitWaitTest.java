import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ExplicitWaitTest {

    @Test
    public void msgWaitTest() {


//        first way of explicit custom-wait, this way of implementing should be AVOIDED, because the class will live forever in your project

        /*WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax-waits/ajax.html");

        String firstBtnXpath = "//*[@id=\"demo\"]/button";
        WebElement firstStepButton = driver.findElement(By.xpath(firstBtnXpath));
        firstStepButton.click();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        MyCondition condition1 = new MyCondition();

        WebElement msg1 = wait.until(condition1);

        assertTrue(msg1.getText().contains("Hello Pragmatic Student, please assert this text"));*/

        /*
				2) second way of explicit custom-wait
			 */

			/*
				2.1) first way is to create a reference and pass it to the until



        WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax-waits/ajax.html");

        String firstBtnXpath = "//*[@id=\"demo\"]/button";
        WebElement firstStepButton = driver.findElement(By.xpath(firstBtnXpath));
        firstStepButton.click();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        ExpectedCondition<WebElement> btn1TextExpectedCondition = new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"hello-message\"]"));
            }
        };

        WebElement msg1 = wait.until(btn1TextExpectedCondition);

        assertTrue(msg1.getText().contains("Hello Pragmatic Student, please assert this text"));

    }
}




        2.2)or the other way not to have the reference, just implement everything in the brackets of until()
*/

        WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax-waits/ajax.html");

        String firstBtnXpath = "//*[@id=\"demo\"]/button";
        WebElement firstStepButton = driver.findElement(By.xpath(firstBtnXpath));
        firstStepButton.click();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement msg1 = wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"hello-message\"]"));
            }
        });

        assertTrue(msg1.getText().contains("Hello Pragmatic Student, please assert this text"));

        String secondBtnXpath = "//*[@id=\"container\"]/button";
        WebElement secondStepButton = driver.findElement(By.xpath(secondBtnXpath));
        secondStepButton.click();

        WebElement msg2 = wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"anotherDoc\"]/div/p"));
            }
        });

        Assert.assertTrue(msg2.getText().contains("You did a good job!"));

    }
}


