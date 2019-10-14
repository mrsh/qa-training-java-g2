package selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public final String url = "https://google.com";

    @BeforeSuite
    public void setChromePath() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mlz\\Documents\\Szkolenie QA\\Grupa 2\\java\\qa-training-java-g2\\chromedriver.exe");
    }

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
