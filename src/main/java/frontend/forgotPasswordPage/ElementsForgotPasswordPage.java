package frontend.forgotPasswordPage;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsForgotPasswordPage {
    private final WebDriver driver;
    public ElementsForgotPasswordPage() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getTitle() {
        return driver.findElement(By.cssSelector(".page-h1"));
    }
}
