package frontendTests.searchTests;

import frontend.mainPage.ElementsMainPage;
import frontend.searchPage.ElementsSearchPage;
import frontendTests.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class SearchMainPageTests extends BaseTest {
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();
    private final ElementsSearchPage elementsSearchPage = new ElementsSearchPage();

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
        WebElement searchSuggestion = elementsMainPage.getSearchSuggestions();
        wait.until(ExpectedConditions.visibilityOf(elementsMainPage.getSearchSuggestions()));
        assertTrue(searchSuggestion.isDisplayed(), "Suggestions is not displayed");
    }
    @Test
    public void impossibleSearch() {
        elementsMainPage.getSearchInput().sendKeys("sdazszvveswebrzzbebb");
        elementsMainPage.getSearchButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchNullResultsPageTitle = elementsSearchPage.getSearchNullResultsTitle();
        wait.until(ExpectedConditions.visibilityOf(searchNullResultsPageTitle));
        assertTrue(searchNullResultsPageTitle.isDisplayed(), "System shows the results when the search is impossible");
    }
    @Test
    public void emptySearch() {
        elementsMainPage.getSearchButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchNullResultsPageTitle = elementsSearchPage.getSearchNullResultsTitle();
        wait.until(ExpectedConditions.visibilityOf(searchNullResultsPageTitle));
        assertTrue(searchNullResultsPageTitle.isDisplayed(), "System shows the results with 'empty' search");
    }
}
