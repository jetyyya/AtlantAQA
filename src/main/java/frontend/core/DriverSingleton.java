package frontend.core;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
//            capabilities.setCapability("enableVNC", true);
            capabilities.setPlatform(Platform.ANY);

            if (isSeleniumGridAvailable()) {
                try {
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    private static boolean isSeleniumGridAvailable() {
        boolean isAvailable = false;

        try {
            URL gridUrl = new URL("http://localhost:4444/wd/hub/status");
            HttpURLConnection connection = (HttpURLConnection) gridUrl.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                isAvailable = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isAvailable;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

