package logout;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogoutTest extends BaseTests {
    @Test
    public void testLoginFunctionality(){
        String username ="Alicade";
        String password = "1234567890";
        var loginPage = homePage.clickAccount();
        String actualResult = loginPage.setCredentials(username, password);
        assertEquals(actualResult, "Hello "+username+" (not "+username+"? Log out)", "Something Went Wrong!!!");
        boolean actualLogoutResult=loginPage.logout();
        boolean expectedLogoutResult = true;
        System.out.println(actualLogoutResult);
        assertEquals(actualLogoutResult, expectedLogoutResult, "Alicade may me I messed up things");
    }
}
