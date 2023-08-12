package frontendTests.headerTests;

import frontend.blogPage.ElementsBlogPage;
import frontend.contactsPage.ElementsContactsPage;
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
        assertTrue(elementsVacancyPage.getTitle().isDisplayed(), "The 'Vacancy' page did not load");
    }
    @Test
    public void blogPageLoading() {
        elementsHeader.getBlog().click();
        assertTrue(elementsBlogPage.getTitle().isDisplayed(), "The 'Blog' page did not load");
    }
    @Test
    public void deliveryPageLoading() {
        elementsHeader.getDelivery().click();
        assertTrue(elementsDeliveryPage.getTitle().isDisplayed(), "The 'Delivery' page did not load");
    }
    @Test
    public void reviewPageLoading() {
        elementsHeader.getReview().click();
        assertTrue(elementsReviewPage.getTitle().isDisplayed(), "The 'Review' page did not load");
    }
    @Test
    public void contactsPageLoading() {
        elementsHeader.getContacts().click();
        assertTrue(elementsContactsPage.getTitle().isDisplayed(), "The 'Contacts' page did not load");
    }
    @Test
    public void discountPageLoading() {
        elementsMainPage.getRegionSwitchList().click();
        assertTrue(elementsMainPage.getRegionSwitchListTitle().isDisplayed(), "Region switch menu not displayed");
    }
}
