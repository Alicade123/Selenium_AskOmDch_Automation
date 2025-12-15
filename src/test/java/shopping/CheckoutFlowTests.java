package shopping;

import base.BaseTests;
import org.testng.annotations.Test;

public class CheckoutFlowTests extends BaseTests {
    @Test
    public void testShopping(){
        var StorePage = homePage.ClickShopNow();
        StorePage.variousNumberOfItemsToCart(1,2,4);
    }
}
