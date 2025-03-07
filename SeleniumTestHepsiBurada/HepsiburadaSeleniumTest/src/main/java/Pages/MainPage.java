package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseTest {

    @Step("Kullanıcı bilgisi alınır")
    public String getAccount() {
//        screenshot();
        return driver.findElements(By.cssSelector("[class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq']")).get(0).getText();
        }

    @Step("Arama alanına veri girşi sağlanır")
    public MainPage fillSearch(String text){

        WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test-id='search-bar-input']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", searchBar);
        searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test-id='search-bar-input']")));
        searchBar.sendKeys(text + Keys.ENTER);

        return this;
    }

    @Step("Hesabım butonuna tıklanır.")
    public MainPage clickMyAccount() {

        driver.findElement(By.cssSelector("[data-test-id=\"account\"]")).click();
        return this;

    }

    @Step("Giriş Yap butonuna tıklanır.")
    public MainPage clickLogin() {

        driver.findElement(By.id("login")).click();
        return this;

    }

    @Step("Kullanıcı Bilgilerim butonuna tıklanır.")
    public MainPage clickUserInformation() {

        driver.findElement(By.cssSelector("[title=\"Kullanıcı Bilgilerim\"]")).click();
        return this;

    }
    @Step("Giriş Yap butonuna tıklanır.")
    public MainPage clickMyCart() {

        driver.findElement(By.cssSelector("[class=\"sf-OldMyAccount-MjrNQp_LLdAaN1g0xvSz sf-OldMyAccount-VcxldoRSjUmlWBLJaTly\"]")).click();
        return this;

    }

    @Step("Çerezleri Kabul Et butonuna tıklanır.")
    public MainPage acceptAllCokies() {

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        return this;

    }


}
