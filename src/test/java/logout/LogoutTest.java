package logout;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Test
public class LogoutTest extends BaseTests {

@Test (priority = 1)
public void testLoginWithValidCredentials(){
    String username ="Alicade";
    String password = "1234567890";
    var loginPage = homePage.clickAccount();
    String actualResult = loginPage.setCredentials(username, password);
    assertEquals(actualResult, "Hello "+username+" (not "+username+"? Log out)", "Something Went Wrong!!!");
}
@Test(priority = 2, dependsOnMethods = "testLoginWithValidCredentials")
    public void testLoginFunctionality(){
        var loginPage = homePage.clickAccount();
        boolean actualLogoutResult=loginPage.logout();
        boolean expectedLogoutResult = true;
        System.out.println(actualLogoutResult);
        assertEquals(actualLogoutResult, expectedLogoutResult, "Alicade may me I messed up things");
    }
}
