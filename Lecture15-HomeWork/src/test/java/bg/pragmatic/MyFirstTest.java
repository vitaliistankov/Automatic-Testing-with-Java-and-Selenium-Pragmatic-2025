package bg.pragmatic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        this.driver = new ChromeDriver();


    }

    @Test
    public void myFirstTest(){
        driver.get("http://auto.pragmatic.bg/manage");

    }
}

