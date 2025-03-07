package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductListPage extends BaseTest {

    @Step("Ürün listesindeki ilk ürüne tıklanır")
    public ProductListPage firstProductClick(){

        driver.findElements(By.cssSelector("[class=\"productCardLink-XUJYBO4aGZl6zvMNIzAJ\"]")).get(0).click();
        return this;
    }
}
