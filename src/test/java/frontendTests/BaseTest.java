package frontendTests;

import frontend.core.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)).pageLoadTimeout(Duration.ofSeconds(20));
    }
    @AfterSuite
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
