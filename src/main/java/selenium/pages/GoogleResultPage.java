package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.base.TestCommons;

import java.util.List;

public class GoogleResultPage extends TestCommons {
    private WebDriver driver;

    @FindBy(className = "g")
    public List<WebElement> searchResults;

    String searchResultLinkXpath = ".//div/div/div/div/a";
    String x = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]";

    public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getResultElement(int number) {
        return searchResults.get(number);
    }

    public String getElementAttribute(WebElement element, String attributeName) {
        return element.findElement(By.xpath(searchResultLinkXpath)).getAttribute(attributeName);
    }
}
