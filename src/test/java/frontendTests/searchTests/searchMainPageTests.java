package frontendTests.searchTests;

import frontend.mainPage.ElementsMainPage;
import frontend.searchPage.ElementsSearchPage;
import frontendTests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class searchMainPageTests extends BaseTest {
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();
    private final ElementsSearchPage elementsSearchPage = new ElementsSearchPage();

    @BeforeMethod
    public void setup() {
        driver.get("https://atlant-shop.com.ua/uk");
    }

    @Test
    public void simpleSearch() {
        elementsMainPage.getSearchInput().sendKeys("intertool");
        elementsMainPage.getSearchButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchResultsPageTitle = elementsSearchPage.getSearchResultsTitle();
        wait.until(ExpectedConditions.visibilityOf(searchResultsPageTitle));
        assertTrue(searchResultsPageTitle.isDisplayed(), "Page 'Search Result' not displayed");
    }
    @Test
    public void suggestionsSearch() {
        elementsMainPage.getSearchInput().sendKeys("int");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsMainPage.getSearchSuggestions()));
 //       List<WebElement> searchSuggestionsList = elementsMainPage.getSearchSuggestions();
 //       assertTrue(searchSuggestionsList.size() > 0, "Suggestions not displayed");
    }
}
