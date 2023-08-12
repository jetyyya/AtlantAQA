package frontend.registrationForm;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsRegistrationForm {
    private final WebDriver driver;

    public ElementsRegistrationForm() {
        driver = DriverSingleton.getDriver();
    }

    public WebElement getRegPageTitle() {
        WebElement title;
        title = driver.findElement(By.cssSelector(".page-h1"));
        return title;
    }
}
