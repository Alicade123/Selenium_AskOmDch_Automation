package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests {
    @Test
    public void testLoginWithValidCredentials(){
        String username ="Alicade";
        String password = "1234567890";
        var loginPage = homePage.clickAccount();
        String actualResult = loginPage.setCredentials(username, password);
        assertEquals(actualResult, "Hello "+username+" (not "+username+"? Log out)", "Something Went Wrong!!!");
    }

    @Test
    public void testLoginWithUnregisterdCredentials(){
        String username ="zedzedzedzedzed";
        String password = "1234567890";
        var loginPage = homePage.clickAccount();
        String actualResult = loginPage.setCredentialsForUnregisterdUser(username, password);
        String expectResult = "Error: The username "+username+" is not registered on this site. If you are unsure of your username, try your email address instead.";
        assertEquals(actualResult,expectResult,"OOPs! Something went wrong!");
    }
}
