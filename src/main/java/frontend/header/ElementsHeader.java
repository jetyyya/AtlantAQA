package frontend.header;

import frontend.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsHeader {
    private final WebDriver driver;
    public ElementsHeader() {
        driver = DriverSingleton.getDriver();
    }
    public WebElement getVacancy() {
        return driver.findElement(By.cssSelector("a[href=\"/uk/vakansiyi-kompaniyi-atlant\"]"));
    }
    public WebElement getBlog() {
        return driver.findElement(By.cssSelector("a[href=\"/uk/all-records-uk\"]"));
    }
    public WebElement getDelivery() {
        return driver.findElement(By.cssSelector("li.custommenu-has-icon a[href=\"/uk/oplata-ta-dostavka\"]"));
    }
    public WebElement getReview() {
        return driver.findElement(By.cssSelector("a[href=\"/uk/store-review-uk\"]"));
    }
    public WebElement getContacts() {
        return driver.findElement(By.cssSelector("li.custommenu-has-icon a[href=\"/uk/contacts-uk\"]"));
    }
}
