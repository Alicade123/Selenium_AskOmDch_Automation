package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StoreCategoryBrowser {
    protected WebDriver driver;
    private WebDriverWait wait;
    private By orderbyField = By.name("orderby");
    public StoreCategoryBrowser(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String sortProducts(String sortingRule){
        Select select=new Select(driver.findElement(orderbyField));
        select.selectByValue(sortingRule);
        return driver.getCurrentUrl();
    }

    private By dropdownField = By.id("product_cat");
    public ChosenCategoryPage browserProductCategory(String category){
        WebElement dropdown = driver.findElement(dropdownField);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dropdown);
        Select select = new Select(dropdown);
        select.selectByValue(category);
        return new ChosenCategoryPage(driver);
        }
}
