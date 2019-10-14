package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.base.TestCommons;

public class GoogleSearchPage extends TestCommons {
    private WebDriver driver;

    @FindBy(name = "q")
    public WebElement searchInput;

    @FindBy(css = ".gNO89b")
    public WebElement submitButton;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchInput(String text){
        sendKeysToWebElement(searchInput, text);
    }

    public void clickSubmitButton() {
        clickElement(submitButton);
    }
}
