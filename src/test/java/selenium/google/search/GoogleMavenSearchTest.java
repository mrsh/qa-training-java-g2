package selenium.google.search;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.GoogleResultPage;
import selenium.pages.GoogleSearchPage;

public class GoogleMavenSearchTest extends TestBase {
    private final String queryText = "maven selenium webdriver";
    private final String expectedLink = "https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java";

    @Test
    public void performGoogleMavenSearch() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.sendKeysToSearchInput(queryText);
        googleSearchPage.clickSubmitButton();
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        String firstSearchResultLink = googleResultPage.getElementAttribute(googleResultPage.getResultElement(0), "href");
        Assert.assertEquals(firstSearchResultLink, expectedLink, "Maven repository is not the first search result.");
    }
}
