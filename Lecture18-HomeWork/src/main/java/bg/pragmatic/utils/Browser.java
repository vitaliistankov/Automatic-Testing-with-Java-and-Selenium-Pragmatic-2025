package bg.pragmatic.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;

    /**
     * Opens a new maximized default Chrome browser
     * with a default implicit wait of 10 seconds.
     */
    public static void open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    /**
     * Quits the browser process
     */
    public static void quit() {
        driver.quit();
    }
}
