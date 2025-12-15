package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        var navigationTestPage = homePage.clickNavigation();
        //AskOmDch
        String actualResult = navigationTestPage.clickAskOmDch();
        String expectedResult = "AskOmDch – Become a Selenium automation expert!";
        assertEquals(actualResult, expectedResult, "Something went wrong Alicade!");

        //Home
        String actualResultHome = navigationTestPage.clickHome();
        String expectedResultHome = "AskOmDch – Become a Selenium automation expert!";
        assertEquals(actualResultHome, expectedResultHome, "Something went wrong Alicade!");

        //Store
        String actualResultStore = navigationTestPage.clickStore();
        String expectedResultStore = "Products – AskOmDch";
        assertEquals(actualResultStore, expectedResultStore, "Something went wrong Alicade!");

        //Men
        String actualResultMen = navigationTestPage.clickMen();
        String expectedResultMen = "Men – AskOmDch";
        assertEquals(actualResultMen, expectedResultMen, "Something went wrong Alicade!");

        //Women
        String actualResultWomen = navigationTestPage.clickWomen();
        String expectedResultWomen = "Women – AskOmDch";
        assertEquals(actualResultWomen, expectedResultWomen, "Something went wrong Alicade!");

        //Accessories
        String actualResultAccessories = navigationTestPage.clickAccessories();
        String expectedResultAccessories = "Accessories – AskOmDch";
        assertEquals(actualResultAccessories, expectedResultAccessories, "Something went wrong Alicade!");

        //Account
        String actualResultAccount = navigationTestPage.clickAccount();
        String expectedResultAccount = "Account – AskOmDch";
        assertEquals(actualResultAccount, expectedResultAccount, "Something went wrong Alicade!");

        //About
        String actualResultAbout = navigationTestPage.clickAbout();
        String expectedResultAbout = "About – AskOmDch";
        assertEquals(actualResultAbout, expectedResultAbout, "Something went wrong Alicade!");

        //Contact Us
        String actualResultContact_Us = navigationTestPage.clickContactUs();
        String expectedResultContact_Us = "Contact Us – AskOmDch";
        assertEquals(actualResultContact_Us, expectedResultContact_Us, "Something went wrong Alicade!");

        //Cart
        String actualResultCart = navigationTestPage.clickCart();
        String expectedResultCart = "Cart – AskOmDch";
        assertEquals(actualResultCart, expectedResultCart, "Something went wrong Alicade!");

    }
}

