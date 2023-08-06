package frontend.core.scrolls;

import frontend.core.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToEnd {
    private final WebDriver driver;

    public ScrollToEnd() {
        driver = DriverSingleton.getDriver();
        Actions scrollToEnd = new Actions(driver);
        scrollToEnd.sendKeys(Keys.END).build().perform();
    }
}
