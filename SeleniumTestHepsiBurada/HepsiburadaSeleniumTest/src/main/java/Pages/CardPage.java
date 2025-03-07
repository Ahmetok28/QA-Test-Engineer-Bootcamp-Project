package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CardPage extends BaseTest {


    @Step("Sepetten sil Butonuna tıklanır")
    public CardPage deleteCart() {
        driver.findElement(By.cssSelector("[class=\"basket_delete_1U-UX\"]")).click();
        driver.findElement(By.xpath("//button[text()='Tümünü sil']")).click();
        return this;
    }

    @Step("Sepet Boş mu?")
    public String isCartEmpty() {
        return driver.findElement(By.xpath("//div[@class='content_Z9h8v']/h1")).getText();
    }

    @Step("Ürün Adedi Arttır Butonu")
    public void increaseQuantity() {
        driver.findElement(By.cssSelector("[aria-label=\"Ürünü Arttır\"]")).click();
    }

    @Step("Ürün Adedi Azalt Butonu")
    public void decreaseQuantity() {
        driver.findElement(By.cssSelector("[aria-label=\"Ürünü Azalt\"]")).click();
    }

    @Step("Ürün Adedi")
    public int getQuantity() {
        return Integer.parseInt(driver.findElement(By.cssSelector("[name=\"quantity\"]")).getAttribute("value"));
    }


}
