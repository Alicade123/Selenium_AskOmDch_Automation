package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Store {
    protected WebDriver driver;
    private WebDriverWait wait;
    private By orderbyField = By.name("orderby");
    public Store(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void sortProducts(String sortingRule){
        Select select=new Select(driver.findElement(orderbyField));
        select.selectByValue(sortingRule);
    }

    private By dropdownField = By.id("product_cat");

    public void browserProductCategory(String category){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", driver.findElement(dropdownField));
        Select select = new Select(driver.findElement(dropdownField));
        select.selectByContainsVisibleText(category);
    }
}
