package frontendTests.headerTests;

import frontend.blogPage.ElementsBlogPage;
import frontend.contactsPage.ElementsContactsPage;
import frontend.core.waiters.WaiterVisibilityOf;
import frontend.deliveryPage.ElementsDeliveryPage;
import frontend.header.ElementsHeader;
import frontend.mainPage.ElementsMainPage;
import frontend.reviewPage.ElementsReviewPage;
import frontend.vacancyPage.ElementsVacancyPage;
import frontendTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsHeaderTests extends BaseTest {
    private final ElementsHeader elementsHeader = new ElementsHeader();
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();
    private final ElementsVacancyPage elementsVacancyPage = new ElementsVacancyPage();
    private final ElementsBlogPage elementsBlogPage = new ElementsBlogPage();
    private final ElementsDeliveryPage elementsDeliveryPage = new ElementsDeliveryPage();
    private final ElementsReviewPage elementsReviewPage = new ElementsReviewPage();
    private final ElementsContactsPage elementsContactsPage = new ElementsContactsPage();

    @Test
    public void vacancyPageLoading() {
        elementsHeader.getVacancy().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsVacancyPage.getTitle());
        assertTrue(elementsVacancyPage.getTitle().isDisplayed(), "The 'Vacancy' page did not load");
    }
    @Test
    public void blogPageLoading() {
        elementsHeader.getBlog().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsBlogPage.getTitle());
        assertTrue(elementsBlogPage.getTitle().isDisplayed(), "The 'Blog' page did not load");
    }
    @Test
    public void deliveryPageLoading() {
        elementsHeader.getDelivery().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsDeliveryPage.getTitle());
        assertTrue(elementsDeliveryPage.getTitle().isDisplayed(), "The 'Delivery' page did not load");
    }
    @Test
    public void reviewPageLoading() {
        elementsHeader.getReview().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsReviewPage.getTitle());
        assertTrue(elementsReviewPage.getTitle().isDisplayed(), "The 'Review' page did not load");
    }
    @Test
    public void contactsPageLoading() {
        elementsHeader.getContacts().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsContactsPage.getTitle());
        assertTrue(elementsContactsPage.getTitle().isDisplayed(), "The 'Contacts' page did not load");
    }
    @Test
    public void discountPageLoading() {
        elementsMainPage.getRegionSwitchList().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsMainPage.getRegionSwitchListTitle());
        assertTrue(elementsMainPage.getRegionSwitchListTitle().isDisplayed(), "Region switch menu not displayed");
    }
}
