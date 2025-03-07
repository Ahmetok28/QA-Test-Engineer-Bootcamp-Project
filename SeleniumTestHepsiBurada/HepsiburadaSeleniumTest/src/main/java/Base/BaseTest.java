package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest extends BaseLibrary {



    @BeforeMethod
    public void openBrowser(){

        String profilePath="C:\\Users\\Ahmet\\AppData\\Local\\Google\\Chrome for Testing\\User Data";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + profilePath);
        options.addArguments("profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chrome-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://giris.hepsiburada.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.get("https://giris.hepsiburada.com/");
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
