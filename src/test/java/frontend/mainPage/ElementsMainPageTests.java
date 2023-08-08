package frontend.mainPage;

import frontend.BaseTest;
import frontend.core.scrolls.ScrollToEnd;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ElementsMainPageTests extends BaseTest {

    private final ElementsMainPage elementsMainPage = new ElementsMainPage();

    @BeforeMethod
    public void setup() {
        driver.get("https://atlant-shop.com.ua/uk");
    }
    @Test
    public void logoPresence(){
        assertTrue(elementsMainPage.isLogoDisplayed(), "Логотип відсутній");
    }
    @Test
    public void copyrightsPresence(){
        new ScrollToEnd();
        assertTrue(elementsMainPage.isCopyrightsDisplayed(), "Авторські права відсутні");
    }
    @Test
    public void contactsPresence(){
//        new ScrollToEnd();
        assertTrue(elementsMainPage.isContactsDisplayed(), "Контактний телефон відсутній");
    }
}

