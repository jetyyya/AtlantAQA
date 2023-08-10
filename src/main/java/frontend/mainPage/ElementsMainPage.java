package frontend.mainPage;


import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsMainPage {
    private final WebDriver driver;

    public ElementsMainPage() {
        driver = DriverSingleton.getDriver();
    }
    public boolean isLogoDisplayed() {
        WebElement logo = driver.findElement(By.cssSelector("#logo"));
        return logo.isDisplayed();
    }
    public boolean isCopyrightsDisplayed() {
        WebElement copyrights = driver.findElement(By.cssSelector(".copyright"));
        return copyrights.isDisplayed();
    }
    public boolean isContactsDisplayed() {
        WebElement contacts = driver.findElement(By.cssSelector(".tel"));
        return contacts.isDisplayed();
    }
    public WebElement getSearchInput() {
        WebElement searchInput = driver.findElement(By.cssSelector("input[name=\"search\"]"));
        return searchInput;
    }
    public WebElement getSearchButton() {
        WebElement searchButton = driver.findElement(By.cssSelector(".serach-btn"));
        return searchButton;
    }
    public WebElement getSearchSuggestions() {
        WebElement searchSuggestions = driver.findElement(By.cssSelector("#search > div > ul > li:nth-child(1)"));
        return searchSuggestions;
    }
}
