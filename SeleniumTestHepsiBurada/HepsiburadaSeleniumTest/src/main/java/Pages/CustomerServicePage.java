package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CustomerServicePage extends BaseTest {

    @Step("Müşteri Hizmetleri sayfasına yönlendirme")
    public CustomerServicePage goToCustomerServicePage() {
        driver.findElement(By.cssSelector("[title=\"Müşteri Hizmetleri\"]")).click();
        return this;
    }

    @Step("Destek almak istenen konu yazılır")
    public CustomerServicePage submitSupportRequest(String text) {
        driver.findElement(By.cssSelector("[class=\"text left-icon\"]")).sendKeys(text+ Keys.ENTER);
        return this;
    }

    @Step("Destek almak istenen konu yazılır")
    public boolean chatBotIsItOpen(){
       return driver.findElement(By.cssSelector("[class=\"chat-bot\"]")).isDisplayed();

    }

}
