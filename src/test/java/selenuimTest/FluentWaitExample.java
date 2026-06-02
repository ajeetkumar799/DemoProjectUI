package selenuimTest;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class FluentWaitExample {
    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver() ;// initialize driver

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
                wait.withTimeout(Duration.ofSeconds(30))       // max wait time
                .pollingEvery(Duration.ofSeconds(5))       // check every 5 seconds
                .ignoring(NoSuchElementException.class);   // ignore exception

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("foo"));
            }
        });

        element.click();
    }
}
