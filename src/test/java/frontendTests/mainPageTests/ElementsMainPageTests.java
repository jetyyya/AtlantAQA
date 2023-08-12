package frontendTests.mainPageTests;

import frontend.core.scrolls.ScrollToEnd;
import frontend.mainPage.ElementsMainPage;
import frontendTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementsMainPageTests extends BaseTest {
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();

    @Test
    public void logoPresence(){
        driver.get("https://atlant-shop.com.ua/uk");
        assertTrue(elementsMainPage.isLogoDisplayed(), "The logo is missing");
    }
    @Test
    public void copyrightsPresence(){
        driver.get("https://atlant-shop.com.ua/uk");
        new ScrollToEnd();
        assertTrue(elementsMainPage.isCopyrightsDisplayed(), "There is no copyright");
    }
    @Test
    public void contactsPresence(){
        driver.get("https://atlant-shop.com.ua/uk");
        new ScrollToEnd();
        assertTrue(elementsMainPage.isContactsDisplayed(), "There is no contact phone number");
    }
}

