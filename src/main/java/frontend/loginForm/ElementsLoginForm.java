package frontend.loginForm;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLoginForm {
    private final WebDriver driver;

    public ElementsLoginForm() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getEmailInput() {
        WebElement emailInput;
        emailInput = driver.findElement(By.cssSelector("#input-email-login"));
        return emailInput;
    }
    public WebElement getPasswordInput() {
        WebElement passwordButton;
        passwordButton = driver.findElement(By.cssSelector("#input-password-login"));
        return passwordButton;
    }
    public WebElement getLoginButton() {
        WebElement loginButton;
        loginButton = driver.findElement(By.cssSelector(".btn.btn-primary.loginaccount"));
        return loginButton;
    }
    public WebElement getForgotLink() {
        WebElement forgotLink;
        forgotLink = driver.findElement(By.cssSelector(".quick-login--forgotten"));
        return forgotLink;
    }
    public WebElement getRegistrationLink() {
        WebElement RegistrationLink;
        RegistrationLink = driver.findElement(By.cssSelector(".quick-login--register"));
        return RegistrationLink;
    }
    public WebElement getAlertWrongCredentials() {
        WebElement loginAlertWrongCredentials;
        loginAlertWrongCredentials = driver.findElement(By.cssSelector(".alert.alert-danger"));
        return loginAlertWrongCredentials;
    }
    }
