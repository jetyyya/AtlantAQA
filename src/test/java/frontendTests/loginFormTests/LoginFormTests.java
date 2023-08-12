package frontendTests.loginFormTests;

import frontend.core.waiters.WaiterVisibilityOf;
import frontend.forgotPasswordPage.ElementsForgotPasswordPage;
import frontend.loginForm.ElementsLoginForm;
import frontend.mainPage.ElementsMainPage;
import frontend.registrationForm.ElementsRegistrationForm;
import frontendTests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginFormTests extends BaseTest {
    private final ElementsMainPage elementsMainPage = new ElementsMainPage();
    private final ElementsLoginForm elementsLoginForm = new ElementsLoginForm();
    private final ElementsForgotPasswordPage elementsForgotPasswordPage = new ElementsForgotPasswordPage();
    private final ElementsRegistrationForm elementsRegistrationForm = new ElementsRegistrationForm();

    @Test(priority = 1)
    public void registrationPageLoading() {
        elementsMainPage.getLoginLink().click();
        WaiterVisibilityOf waiterVisibilityOfEmailInput = new WaiterVisibilityOf(driver);
        waiterVisibilityOfEmailInput.waitForVisibility(elementsLoginForm.getRegistrationLink());
        elementsLoginForm.getRegistrationLink().click();
        WaiterVisibilityOf waiterVisibilityOfTitleRegPage = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitleRegPage.waitForVisibility(elementsRegistrationForm.getRegPageTitle());
        assertTrue(elementsRegistrationForm.getRegPageTitle().isDisplayed(), "Registration page not loaded");
    }
    @Test(priority = 2)
    public void forgotPasswordPageLoading() {
        elementsMainPage.getLoginLink().click();
        elementsLoginForm.getForgotLink().click();
        WaiterVisibilityOf waiterVisibilityOfTitle = new WaiterVisibilityOf(driver);
        waiterVisibilityOfTitle.waitForVisibility(elementsForgotPasswordPage.getTitle());
        assertTrue(elementsForgotPasswordPage.getTitle().isDisplayed(),"Forgot password page not loaded");
    }
    @Test(priority = 3)
    public void loginEmptyCredentials() {
        elementsMainPage.getLoginLink().click();
        WaiterVisibilityOf waiterVisibilityOfLoginButton = new WaiterVisibilityOf(driver);
        waiterVisibilityOfLoginButton.waitForVisibility(elementsLoginForm.getLoginButton());
        elementsLoginForm.getLoginButton().click();
        assertTrue(elementsLoginForm.getAlertWrongCredentials().isDisplayed(), "Alert about wrong credentials not displayed");
    }

}
