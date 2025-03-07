import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CardTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CardPage cardPage = new CardPage();

    @Test(description = "Sepete Ürün Ekleme")
    public void addToCartTest() {
        sleep(5000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(3000);
        mainPage.fillSearch("Acer Nitro 5");
        sleep(3000);
        productListPage.firstProductClick();
        switchTab(1);
        productDetailPage.addToCartButtonClick();
        sleep(1000);
    }

    @Test(description = "Sepetteki ürünün adedini arttırma")
    public void increaseQuantityTest() {

        driver.get("https://www.hepsiburada.com/");
        sleep(3000);
        mainPage.fillSearch("Acer Nitro 5");
        sleep(3000);
        productListPage.firstProductClick();
        switchTab(1);
        productDetailPage.addToCartButtonClick();
        sleep(1000);
        mainPage.clickMyCart();
        sleep(1000);
        cardPage.increaseQuantity();
        Assert.assertEquals(cardPage.getQuantity(),2);

    }

    @Test(description = "Sepetteki ürünüleri silme ")
    public void deleteToCartTest() {

        driver.get("https://www.hepsiburada.com/");
        sleep(3000);
        mainPage.fillSearch("Acer Nitro 5");
        sleep(3000);
        productListPage.firstProductClick();
        switchTab(1);
        productDetailPage.addToCartButtonClick();
        sleep(1000);
        mainPage.clickMyCart();
        sleep(1000);
        cardPage.deleteCart();
        sleep(2000);
        Assert.assertEquals(cardPage.isCartEmpty(),"Sepetin şu an boş");

    }


}
