import Base.BaseTest;
import Pages.CustomerServicePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerServicePageTest  extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    CustomerServicePage customerServicePage = new CustomerServicePage();

    @Test(description = "Chat Bot Kontrolü")
    public void openChatBot() {
        sleep(3000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(5000);
        customerServicePage.goToCustomerServicePage();
        sleep(2000);
        customerServicePage.submitSupportRequest("Siparişimle ilgili bilgi alabilir miyim?");
        sleep(1000);
        Assert.assertEquals(customerServicePage.chatBotIsItOpen(), true);
        screenshot();
        sleep(1000);
    }
}
