package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChosenCategoryPage {
    protected WebDriver driver;
    protected  WebDriverWait wait;
    private By category = By.cssSelector(".woocommerce-products-header h1[class='woocommerce-products-header__title page-title']");
    public ChosenCategoryPage(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getProductsCategory(){

       return driver.findElement(category).getText().trim();
    }

}
