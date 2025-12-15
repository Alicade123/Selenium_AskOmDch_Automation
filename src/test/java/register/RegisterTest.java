package register;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterTest extends BaseTests {
    @Test
    public void testLoginFunctionality(){
        String username ="Alicade4";
        String email = "abiturije4alicade@gmail.com";
        String password = "1234567890";
        var loginPage = homePage.clickAccount();
        String actualResult = loginPage.setCredentialsRegister(username, email, password);
        assertEquals(actualResult, "Hello "+username+" (not "+username+"? Log out)", "Something Went Wrong!!!");
    }
}
