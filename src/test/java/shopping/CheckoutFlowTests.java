package shopping;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckoutFlowTests extends BaseTests {
    @Test
    public void testShopping(){
        var storePage = homePage.ClickShopNow();
        var cartPage = storePage.variousNumberOfItemsToCart();
        var checkoutPage = cartPage.clickCheckoutButton();
        String firstname="Alicade";
        String lastname = "ABITURIJE DUSABE";
        String company = "TheGym";
        String street = "KK607st";
        String country = "United States (US)";
        String address1 = "kigali-Rnda";
        String address2 = "Kicukiro - Centre";
        String city = "Kigali";
        String state ="Wyoming";
        String postcode ="0000";
        String phone ="(+250) 782-5830-16";
        String email ="abiturije@gmail.com";
        String comment= """
                Your service is invaluable,\
                We thank you for your service though.\
                And how you never stop to deliver good services.
                """;
        String payment ="Cash on delivery";
        checkoutPage.fillDetails(
                firstname,lastname,company,street,country,address1,address2,city,state,postcode,phone,
                email,comment,payment
        );
    }
    @Test
    public void testEmptyCartCheckout(){
        String actualResult = homePage.ClickShopNow().variousNumberOfItemsToCart().getEmptyCartStatus();
        String expectedResult = "Your cart is currently empty.";
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void testShoppingMore(){
        var storePage = homePage.ClickShopNow();
        var cartPage = storePage.variousNumberOfItemsToCart(0,1);
    }
}

