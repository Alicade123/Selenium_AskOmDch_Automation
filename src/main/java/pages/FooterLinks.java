package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class FooterLinks {
    protected WebDriverWait wait;
    protected WebDriver driver;
    public FooterLinks(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
     public int[]  clickLink(String [] footLinks){
         List <String> pageTitles = new ArrayList<>();
         List <String> pageUrls = new ArrayList<>();
        for (String link:footLinks){
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText(link))));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'})",driver.findElement(By.partialLinkText(link)));
            driver.findElement(By.partialLinkText(link)).click();
            pageTitles.add(driver.getTitle());
            pageUrls.add(driver.getCurrentUrl());
        }
         System.out.println("Page Titles are: \n"+pageTitles);
         System.out.println("Page Urls are: \n"+pageUrls);
         return new int []{pageTitles.size(), pageUrls.size()};
    }
}
