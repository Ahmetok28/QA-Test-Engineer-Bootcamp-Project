package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogoutPage extends BaseTest {

    @Step("Çıkış Yap Butonuna tıklanır.")
    public LogoutPage clickLogoutButton() {
        List<WebElement> listItems = driver.findElements(By.className("sf-OldMyAccount-qxFp0lp_7uZ6Ov82BhJu"));
        for (WebElement li : listItems) {
            WebElement link = li.findElement(By.tagName("a"));
            if (link.getText().contains("Çıkış Yap")) {
                link.click();
                break;
            }
        }
        return this;
    }
}
