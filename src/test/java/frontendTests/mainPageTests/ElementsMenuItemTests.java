package frontendTests.mainPageTests;

import frontend.discountPage.ElementsDiscountPage;
import frontend.mainPage.ElementsMenuItem;
import frontendTests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsMenuItemTests extends BaseTest {
    private final ElementsMenuItem elementsMenuItem = new ElementsMenuItem();
    private final ElementsDiscountPage elementsDiscountPage = new ElementsDiscountPage();

    @BeforeMethod
    public void setup() {
        driver.get("https://atlant-shop.com.ua/uk");
    }
    @Test
    public void discountWorking() {
        elementsMenuItem.getDiscount().click();
        assertTrue(elementsDiscountPage.getTitle().isDisplayed(), "The \"Promotions\" page did not load");
    }
}
