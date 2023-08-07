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
        WebElement contacts = driver.findElement(By.cssSelector(".telll"));
        return contacts.isDisplayed();
    }
}
