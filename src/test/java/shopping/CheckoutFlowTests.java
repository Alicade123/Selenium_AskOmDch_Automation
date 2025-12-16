package shopping;

import base.BaseTests;
import org.testng.annotations.Test;

public class CheckoutFlowTests extends BaseTests {
    @Test
    public void testShopping(){
        var storePage = homePage.ClickShopNow();
        var cartPage = storePage.variousNumberOfItemsToCart(1,2,4);
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
        String comment="Your service is invaluable,\nWe thank you for your service though." +
                        "\nAnd how you never stop to deliver good services.\n";
        String payment ="Cash on delivery";
        checkoutPage.fillDetails(
                firstname,lastname,company,street,country,address1,address2,city,state,postcode,phone,
                email,comment,payment
        );

    }
}
