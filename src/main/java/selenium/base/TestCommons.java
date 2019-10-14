package selenium.base;

import org.openqa.selenium.WebElement;

public abstract class TestCommons {

    protected void sendKeysToWebElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected void clickElement(WebElement element) {
        element.click();
    }

    protected String getElementAttribute(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }
}
