package frontendTests.mainPageTests;

import frontend.core.waiters.WaiterVisibilityOf;
import frontend.discountPage.ElementsDiscountPage;
import frontend.loanPage.ElementsLoanPage;
import frontend.mainPage.ElementsMenuItem;
import frontend.retailPage.ElementsRetailPage;
import frontend.wholesalePage.ElementsWholesalePage;
import frontendTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsMenuItemTests extends BaseTest {
    private final ElementsMenuItem elementsMenuItem = new ElementsMenuItem();
    private final ElementsDiscountPage elementsDiscountPage = new ElementsDiscountPage();
    private final ElementsRetailPage elementsRetailPage = new ElementsRetailPage();
    private final ElementsWholesalePage elementsWholesalePage = new ElementsWholesalePage();
    private final ElementsLoanPage elementsLoanPage = new ElementsLoanPage();

    @Test
    public void discountPageLoading() {
        elementsMenuItem.getDiscount().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsDiscountPage.getTitle());
        assertTrue(elementsDiscountPage.getTitle().isDisplayed(), "The 'Promotions' page did not load");
    }
    @Test
    public void retailPageLoading() {
        elementsMenuItem.getRetail().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsRetailPage.getTitle());
        assertTrue(elementsRetailPage.getTitle().isDisplayed(), "The 'Retail' page did not load");
    }
    @Test
    public void wholesalePageLoading() {
        elementsMenuItem.getWholesale().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsWholesalePage.getTitle());
        assertTrue(elementsWholesalePage.getTitle().isDisplayed(), "The 'Wholesale' page did not load");
    }
    @Test
    public void loanPageLoading() {
        elementsMenuItem.getLoan().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsLoanPage.getTitle());
        assertTrue(elementsLoanPage.getTitle().isDisplayed(), "The 'Loan' page did not load");
    }
}
