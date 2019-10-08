package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasicTest {
    private WebDriver driver;

    @Test
    private void openBrowser() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
