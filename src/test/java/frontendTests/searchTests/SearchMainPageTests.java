package frontendTests.searchTests;

import frontend.core.waiters.WaiterVisibilityOf;
import frontend.mainPage.ElementsMainPage;
import frontend.searchPage.ElementsSearchPage;
import frontendTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchMainPageTests extends BaseTest {
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();
    private final ElementsSearchPage elementsSearchPage = new ElementsSearchPage();

    @Test
    public void simpleSearch() {
        elementsMainPage.getSearchInput().sendKeys("intertool");
        elementsMainPage.getSearchButton().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsSearchPage.getSearchResultsTitle());
        assertTrue(elementsSearchPage.getSearchResultsTitle().isDisplayed(), "Page 'Search Result' not displayed");
    }
    @Test
    public void suggestionsSearch() {
        elementsMainPage.getSearchInput().sendKeys("int");
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsMainPage.getSearchSuggestions());
        assertTrue(elementsMainPage.getSearchSuggestions().isDisplayed(), "Suggestions is not displayed");
    }
    @Test
    public void impossibleSearch() {
        elementsMainPage.getSearchInput().sendKeys("sdazszvveswebrzzbebb");
        elementsMainPage.getSearchButton().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsSearchPage.getSearchNullResultsTitle());
        assertTrue(elementsSearchPage.getSearchNullResultsTitle().isDisplayed(), "System shows the results when the search is impossible");
    }
    @Test
    public void emptySearch() {
        elementsMainPage.getSearchButton().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsSearchPage.getSearchNullResultsTitle());
        assertTrue(elementsSearchPage.getSearchNullResultsTitle().isDisplayed(), "System shows the results with 'empty' search");
    }
}
