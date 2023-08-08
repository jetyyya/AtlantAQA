package frontend.mainPage;

import frontend.core.DriverSingleton;
import frontend.discountPage.ElementsDiscountPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsMenuItemTests {
    protected static WebDriver driver = DriverSingleton.getDriver();
    private final ElementsMenuItem elementsMenuItem = new ElementsMenuItem();
    private final ElementsDiscountPage elementsDiscountPage = new ElementsDiscountPage();

    @BeforeMethod
    public void setup() {
        driver.get("https://atlant-shop.com.ua/uk");
    }
    @Test
    public void discountWorking() {
        elementsMenuItem.getDiscount().click();
        assertTrue(elementsDiscountPage.getTitle().isDisplayed(), "Сторінка 'Акції' не завантажилась");

    }
    @AfterClass
    public static void tearDown() {
        DriverSingleton.quitDriver();
    }

}
