import Base.BaseTest;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MainPage;
import Pages.UserAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAccountPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    UserAccountPage userAccountPage = new UserAccountPage();

    @Test(description = "kullanıcı Bilgileri Güncelleme")
    public void editProfileSuccessful() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(2000);
        mainPage.clickUserInformation();
        sleep(1000);
        userAccountPage.editName("Ahmet")
                .editSurname("ÖK")
                .editGender("E")
                .editBitrhDay("09.06.2000")
                .clickUpdateBtn();
        screenshot();
        sleep(1000);
    }

    @Test(description = "Şifre Güncelleme")
    public void updatePassword() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(2000);
        mainPage.clickUserInformation();
        sleep(1000);
        userAccountPage.goToPasswordPage();
        sleep(1000);
        userAccountPage.updatePassword("118119270543.oK", password)
                .clickUpdateBtn();
        screenshot();
        sleep(1000);
    }

    @Test(description = "E-Posta Bildirimini Değiştirme")
    public void changeSendEmail() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(2000);
        mainPage.clickUserInformation();
        sleep(1000);
        userAccountPage.goToCommunicationPreferencesPage();
        sleep(1000);
        userAccountPage.changeSendEmail();
        screenshot();
        sleep(1000);
    }

    @Test(description = "SMS Bildirimini Değiştirme")
    public void changeSendSms() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(2000);
        mainPage.clickUserInformation();
        sleep(1000);
        userAccountPage.goToCommunicationPreferencesPage();
        sleep(1000);
        userAccountPage.changeSendSms();
        screenshot();
        sleep(1000);
    }

    @Test(description = "Telefon Araması Bildirimini Değiştirme")
    public void changeSendPhoneCall() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(2000);
        mainPage.clickUserInformation();
        sleep(1000);
        userAccountPage.goToCommunicationPreferencesPage();
        sleep(5000);
        userAccountPage.changeSendPhoneCall();
        screenshot();
        sleep(1000);
    }
}
