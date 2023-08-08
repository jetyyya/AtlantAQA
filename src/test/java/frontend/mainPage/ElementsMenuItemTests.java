package frontend.mainPage;

import frontend.core.BaseTest;
import frontend.discountPage.ElementsDiscountPage;
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
        assertTrue(elementsDiscountPage.getTitle().isDisplayed(), "Сторінка 'Акції' не завантажилась");

    }


}
