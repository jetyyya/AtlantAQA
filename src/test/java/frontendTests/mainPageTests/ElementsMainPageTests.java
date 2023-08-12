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
        assertTrue(elementsMainPage.isLogoDisplayed(), "The logo is missing");
    }
    @Test
    public void copyrightsPresence(){
        new ScrollToEnd();
        assertTrue(elementsMainPage.isCopyrightsDisplayed(), "There is no copyright");
    }
    @Test
    public void contactsPresence(){
        new ScrollToEnd();
        assertTrue(elementsMainPage.isContactsDisplayed(), "There is no contact phone number");
    }
}

