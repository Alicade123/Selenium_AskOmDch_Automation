package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {
    protected WebDriver driver;
    private String websteUrl ="https://askomdch.com/";
    protected HomePage homePage;
//@BeforeSuite
//@BeforeClass
//@BeforeGroups
//@BeforeMethod
//@BeforeTest
//@AfterSuite
//@AfterClass
//@AfterGroups
//@AfterMethod
//@AfterTest
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(websteUrl);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
