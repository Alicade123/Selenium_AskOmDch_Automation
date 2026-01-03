package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class StorePageSearch {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private By searchBar =By.id("woocommerce-product-search-field-0");
    private By searchButton = By.cssSelector("button[type=submit][value=Search]");

    //missing product status
    private By noProductMessage = By.cssSelector("p[class='woocommerce-info woocommerce-no-products-found']");
    //more founds
    private By moreFoundProducts = By.cssSelector("h2[class=\"woocommerce-loop-product__title\"]");
    //oneProductFound
    private By oneProductFound = By.cssSelector("h1[class=\"product_title entry-title\"]");

    public StorePageSearch(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
public boolean doSearch(String keyword){
        driver.findElement(searchBar).sendKeys(keyword);
        driver.findElement(searchButton).click();
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(noProductMessage));

        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(moreFoundProducts));
        boolean areResultAccurate = true;
        for(WebElement elem:elements){
            if(!elem.getText().contains(keyword)) areResultAccurate = false;
        }

        boolean isResultAccurate = true;
        WebElement el =  wait.until(ExpectedConditions.presenceOfElementLocated(oneProductFound));
        if (!el.getText().contains(keyword))   isResultAccurate = false;
        return  areResultAccurate;
}

}
