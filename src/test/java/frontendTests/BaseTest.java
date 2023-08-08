package frontendTests;

import frontend.core.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
