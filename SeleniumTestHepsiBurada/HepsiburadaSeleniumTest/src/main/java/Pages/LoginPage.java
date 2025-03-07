package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {


    @Step("E posta alanına veri girişi sağlanır")
    public LoginPage fillEmail(String email) {
        driver.findElement(By.name("username")).sendKeys(email);
        return this;
    }

    @Step("Parola alanına veri girişi sağlanır")
    public LoginPage fillPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Giriş yap butonuna tıklanır")
    public LoginPage clickLoginButton() {
        driver.findElement(By.id("btnLogin")).click();
        return this;
    }

    @Step("Hata mesajı ekrandan çekilir")
    public String getErrorMessage() {
        return driver.findElement(By.cssSelector("[data-test-id='inline-alert-label']")).getText();
    }


    @Step("Facebook ile Giriş Yap butonuna tıklanır.")
    public LoginPage facebookBtnClick() {

        driver.findElement(By.id("btnFacebook")).click();
        return this;

    }

    @Step("Facebook ile Giriş Yap butonuna tıklanır.")
    public LoginPage facebookDevamEtBtnClick() {
//       Tarayıcıda aktif bir google hesabı açık olmalıdır.
        driver.findElements(By.cssSelector("[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']")).get(0).click();
        return this;

    }

    @Step("Google ile Giriş Yap butonuna tıklanır.")
    public LoginPage googleBtnClick() {
//      Tarayıcıda aktif bir google hesabı açık olmalıdır.
        driver.findElement(By.id("btnGoogle")).click();
        return this;

    }


}
