package frontendTests.mainPageTests;

import frontend.discountPage.ElementsDiscountPage;
import frontend.loanPage.ElementsLoanPage;
import frontend.mainPage.ElementsMenuItem;
import frontend.retailPage.ElementsRetailPage;
import frontend.wholesalePage.ElementsWholesalePage;
import frontendTests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsMenuItemTests extends BaseTest {
    private final ElementsMenuItem elementsMenuItem = new ElementsMenuItem();
    private final ElementsDiscountPage elementsDiscountPage = new ElementsDiscountPage();
    private final ElementsRetailPage elementsRetailPage = new ElementsRetailPage();
    private final ElementsWholesalePage elementsWholesalePage = new ElementsWholesalePage();
    private final ElementsLoanPage elementsLoanPage = new ElementsLoanPage();

    @BeforeMethod
    public void setup() {
        driver.get("https://atlant-shop.com.ua/uk");
    }
    @Test
    public void discountPageLoading() {
        elementsMenuItem.getDiscount().click();
        assertTrue(elementsDiscountPage.getTitle().isDisplayed(), "The 'Promotions' page did not load");
    }
    @Test
    public void retailPageLoading() {
        elementsMenuItem.getRetail().click();
        assertTrue(elementsRetailPage.getTitle().isDisplayed(), "The 'Retail' page did not load");
    }
    @Test
    public void wholesalePageLoading() {
        elementsMenuItem.getWholesale().click();
        assertTrue(elementsWholesalePage.getTitle().isDisplayed(), "The 'Wholesale' page did not load");
    }
    @Test
    public void loanPageLoading() {
        elementsMenuItem.getLoan().click();
        assertTrue(elementsLoanPage.getTitle().isDisplayed(), "The 'Loan' page did not load");
    }
}
