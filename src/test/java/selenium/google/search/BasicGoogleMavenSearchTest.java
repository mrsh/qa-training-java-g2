package selenium.google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicGoogleMavenSearchTest {
    private WebDriver driver;
    private final String url = "https://google.com";

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mlz\\Documents\\Szkolenie QA\\Grupa 2\\java\\qa-training-java-g2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown() {
        driver.quit();
    }

    @Test
    public void googleSearchTest() {
        setUp();
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Google", "Invalid page title.");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        driver.findElement(By.name("q")).sendKeys("maven selenium webdriver");
        driver.findElement(By.className("gNO89b")).click();
        final String expectedHref = "https://mvnrepository.com/artifact/org.seleniumhq.selenium";
        final String href = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]")).getAttribute("href");
        Assert.assertEquals(href, expectedHref, "Maven repository is not the first search result.");
        tearDown();
    }
}
