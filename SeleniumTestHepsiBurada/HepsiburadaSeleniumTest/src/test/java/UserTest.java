import Base.BaseTest;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    LogoutPage logoutPage = new LogoutPage();

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void loginSuccessful() {
        sleep(3000);
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLoginButton();
        sleep(5000);
        Assert.assertEquals(mainPage.getAccount(), "Hesabım");

    }

    @Test(description = "Başarısız Kullanıcı Girişi")
    public void loginUnsuccessful() {

        sleep(3000);
        loginPage.fillEmail(email)
                .fillPassword(password + "44")
                .clickLoginButton();
        sleep(5000);
        Assert.assertEquals(loginPage.getErrorMessage(), "Girdiğiniz şifre eksik veya hatalı.");

    }

    @Test(description = "Facebook ile Kullanıcı Girişi")
    public void loginWithFacebook() {

        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.facebookBtnClick();
        sleep(3000);
        loginPage.facebookDevamEtBtnClick();
        sleep(8000);
        Assert.assertEquals(mainPage.getAccount(), "Hesabım");

    }

    @Test(description = "Google ile Kullanıcı Girişi")
    public void loginWithGoogle() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        Assert.assertEquals(mainPage.getAccount(), "Hesabım");

    }

    @Test(description = "Oturum Kapatma")
    public void Logout() {
        sleep(3000);
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLoginButton();
        sleep(5000);
        mainPage.clickMyAccount();
        sleep(1000);
        logoutPage.clickLogoutButton();

    }

}