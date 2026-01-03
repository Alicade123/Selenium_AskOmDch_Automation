package followus;

import base.BaseTests;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTests {
    @Test
    public void testTabs(){
        String aboutTitle = "About – AskOmDch";
        String UdemyTitle = "Omprakash Chavan | Test Automation Lead | Udemy";
        String linkedInTitle  = "Sign Up | LinkedIn";
        String youTubeTitle  = "askomdch - YouTube";
        var  aboutPage= homePage.clickAbout();
        aboutPage.clickSocialMediaLink();
    }
}
