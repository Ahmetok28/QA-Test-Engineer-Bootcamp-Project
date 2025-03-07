package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductDetailPage extends BaseTest {

    @Step("Favoriye ekle butonuna tıklanır")
    public ProductDetailPage favoriteButtonClick() {

        driver.findElement(By.cssSelector("[class=\"customerAccount-Like-Yr7SGgaBrUaSOLZUPtvq\"]")).click();
        screenshot();
        return this;
    }


    @Step("Sepete Ekle Butonuna tıklanır")
    public ProductDetailPage addToCartButtonClick() {
        driver.findElement(By.cssSelector("[data-test-id=\"addToCart\"]")).click();
        return this;
    }
}
