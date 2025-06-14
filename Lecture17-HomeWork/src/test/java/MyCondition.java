import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCondition implements ExpectedCondition<WebElement> {


    @Override
    public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"hello-message\"]"));
    }
}
