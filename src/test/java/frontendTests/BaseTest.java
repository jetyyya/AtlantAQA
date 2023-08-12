package frontendTests;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.manage().window().maximize();
        driver.get("https://atlant-shop.com.ua/uk");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".information-menu-items.list-unstyled2")));
    }
    @AfterSuite
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
