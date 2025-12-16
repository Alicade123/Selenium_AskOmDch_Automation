package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests {
    @Test
    public void testLoginFunctionality(){
        String username ="Alicade";
        String password = "1234567890";
        var loginPage = homePage.clickAccount();
        String actualResult = loginPage.setCredentials(username, password);
        assertEquals(actualResult, "Hello "+username+" (not "+username+"? Log out)", "Something Went Wrong!!!");
    }
}
