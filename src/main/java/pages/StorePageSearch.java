package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class StorePageSearch {
    protected WebDriver driver;
    private By searchBar =By.id("woocommerce-product-search-field-0");
    private By searchButton = By.cssSelector("button[type=submit][value=Search]");
    public StorePageSearch(WebDriver driver){
        this.driver = driver;
    }
public void doSearch(String keyword){
        driver.findElement(searchBar).sendKeys(keyword);
        driver.findElement(searchButton).click();
}

}
