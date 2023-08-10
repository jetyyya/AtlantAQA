package frontend.reviewPage;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsReviewPage {
    private final WebDriver driver;
    public ElementsReviewPage() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getTitle() {
        return driver.findElement(By.cssSelector(".page-title"));
    }
}
