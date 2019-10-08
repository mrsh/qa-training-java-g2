package selenium.google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleMavenSearchTest {
    private WebDriver driver;
    private final String url = "https://google.com";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mlz\\Documents\\Szkolenie QA\\Grupa 2\\java\\qa-training-java-g2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void googleSearchTest() {
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Google", "Invalid page title.");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
    }
}
