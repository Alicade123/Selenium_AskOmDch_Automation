package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BaseTests {
    protected WebDriver driver;
    private String websteUrl ="https://askomdch.com/";
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(websteUrl);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown(){
//        driver.quit();
    }
@AfterMethod
    public void takeScreenshot(ITestResult result){
        TakesScreenshot camera = ((TakesScreenshot)driver);
        LocalDateTime time = LocalDateTime.now();
        if(result.getStatus()==ITestResult.FAILURE){
            try {
                File file = camera.getScreenshotAs(OutputType.FILE);
                Files.move(file.toPath(), new File("resources/failed/img"+time+"_.png").toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }}
            else if(result.getStatus()==ITestResult.SUCCESS){
                try {
                    File file = camera.getScreenshotAs(OutputType.FILE);
                    Files.move(file.toPath(), new File("resources/passed/img"+time+"_.png").toPath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }


}
