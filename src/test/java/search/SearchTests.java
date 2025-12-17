package search;

import base.BaseTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SearchTests extends BaseTests {
    private static final Logger log = LoggerFactory.getLogger(SearchTests.class);

    @AfterMethod
    public void takeScreenShot(ITestResult result) {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        String testName = result.getName();
        System.out.println(srcFile.getAbsoluteFile());
        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                Files.createDirectories(new File("./Screenshot/failed").toPath());
                Files.move(
                        srcFile.toPath(),
                        new File("Screenshot/failed/" + testName + "_" + timeStamp + ".png").toPath()
                );
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                Files.createDirectories(new File("screenshot/passed").toPath());
                Files.move(
                        srcFile.toPath(),
                        new File("screenshot/passed/" + testName + "_" + timeStamp + ".png").toPath()
                );
            }
        } catch (Exception e) {
            log.error("Failed to save screenshot", e);
        }
    }

    @Test
    public void testSingleKeyWordSearch(){
        String searchKeyword = "Shoes";
        homePage.goToStoreToSearch().doSearch(searchKeyword);
    }

    @Test
    public void testMultipleKeywordsSearch(){
        String searchKeyword = "blue Blue";
        homePage.goToStoreToSearch().doSearch(searchKeyword);
    }

}
