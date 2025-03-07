package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class UserAccountPage extends BaseTest {

    @Step("Kullanıcı İsim Bilgisi Güncelleme")
    public UserAccountPage editName(String newName) {
        driver.findElement(By.id("txtName")).clear();
        driver.findElement(By.id("txtName")).sendKeys(newName);
        return this;

    }

    @Step("Kullanıcı Soy İsim Bilgisi Güncelleme")
    public UserAccountPage editSurname(String newSurname) {
        driver.findElement(By.id("txtSurname")).clear();
        driver.findElement(By.id("txtSurname")).sendKeys(newSurname);
        return this;

    }

    @Step("Kullanıcı Doğum Tarihi Bilgisi Güncelleme")
    public UserAccountPage editBitrhDay(String newBirthDay) {
        driver.findElement(By.id("txtBirthDay")).clear();
        driver.findElement(By.id("txtBirthDay")).sendKeys(newBirthDay);
        return this;

    }

    @Step("Kullanıcı Cinsiyet (E/K) Bilgisi Güncelleme")
    public UserAccountPage editGender(String newGender) {
        if (newGender.equals("E") || newGender.equals("e")) {
            driver.findElement(By.id("genderMale")).click();
        } else {
            driver.findElement(By.id("genderFemale")).click();
        }
        return this;

    }

    @Step("Güncelle Butonuna tıkla")
    public UserAccountPage clickUpdateBtn() {
        driver.findElement(By.xpath("//button[text()='Güncelle']")).click();

        return this;

    }

    @Step("Şifre Değişikliği Sayfasına Yönlendirme")
    public UserAccountPage goToPasswordPage() {
        driver.findElements(By.cssSelector("[class=\"customerAccount-SubItem-di7VJgFWCiUXMMeI8OLG\"]")).get(0).click();
        return this;
    }

    @Step("İletişim Tercihlerini Değiştirme Sayfasına Yönlendirme")
    public UserAccountPage goToCommunicationPreferencesPage() {
        driver.findElements(By.cssSelector("[class=\"customerAccount-SubItem-di7VJgFWCiUXMMeI8OLG\"]")).get(1).click();
        return this;
    }

    @Step("Şifre Güncelleme")
    public UserAccountPage updatePassword(String newPassword, String oldPassword) {
        driver.findElement(By.id("txtOldPassword")).sendKeys(oldPassword);
        driver.findElement(By.id("txtNewPassword")).sendKeys(newPassword);
        return this;
    }

    @Step("İletişim Tercihleri SMS Gönderilsinmi Özelliğini Aç/Kapa")
    public UserAccountPage changeSendSms() {
        driver.findElement(By.xpath("//label[@class='_2z40mUQcxX9uiO5oxpuqFR'][input[@id='isSendSmsAvailable']]")).click();
        return this;
    }

    @Step("İletişim Tercihleri Email Gönderilsinmi Özelliğini Aç/Kapa")
    public UserAccountPage changeSendEmail() {
        driver.findElement(By.xpath("//label[@class='_2z40mUQcxX9uiO5oxpuqFR'][input[@id='isSendEmailAvailable']]")).click();
        return this;
    }

    @Step("İletişim Tercihleri Telefon Araması Yapılsınmı Özelliğini Aç/Kapa")
    public UserAccountPage changeSendPhoneCall() {
        driver.findElement(By.xpath("//label[@class='_2z40mUQcxX9uiO5oxpuqFR']/input[@id='isSendPhoneCallAvailable']/..")).click();
        return this;
    }

}
