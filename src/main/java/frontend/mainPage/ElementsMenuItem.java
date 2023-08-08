package frontend.mainPage;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsMenuItem {
    private final WebDriver driver;
    public ElementsMenuItem() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getDiscount() {
        return driver.findElement(By.cssSelector("a[href=\"/uk/aktsii-uk\"]"));
        }
}
