package frontend.deliveryPage;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsDeliveryPage {
    private final WebDriver driver;
    public ElementsDeliveryPage() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getTitle() {
        return driver.findElement(By.cssSelector("h1.page-title.page-h1"));
    }
}
