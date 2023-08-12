package frontend.searchPage;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsSearchPage {
    private final WebDriver driver;
    public ElementsSearchPage() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getSearchResultsTitle() {
        return driver.findElement(By.cssSelector("h1.page-title.page-h1"));
    }
    public WebElement getSearchNullResultsTitle() {
        return driver.findElement(By.cssSelector(".text-empty"));
    }


}
