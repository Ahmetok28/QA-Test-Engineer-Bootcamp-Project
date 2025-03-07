import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProductDetailPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class FavouriteTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Test(description = "Ürün Detay Favoriler Kontrol")
    public void favouriteTest() {
        sleep(5000);
        mainPage.acceptAllCokies();
        loginPage.googleBtnClick();
        sleep(6000);
        mainPage.fillSearch("Redmi Note 13 Pro Plus");
        sleep(3000);
        productListPage.firstProductClick();
        switchTab(1);
        sleep(3000);
        productDetailPage.favoriteButtonClick();
    }
}
