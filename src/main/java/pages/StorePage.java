package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StorePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private By addToCartButton = By.cssSelector("a[class='button product_type_simple add_to_cart_button ajax_add_to_cart']");
    private By cartLink = By.cssSelector("a[class^='cart-container']");
    public StorePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

public CartPage variousNumberOfItemsToCart(int... items) {
        List<WebElement> availableItems = driver.findElements(addToCartButton);
        if(items.length == 0) {
            WebElement cart = driver.findElement(cartLink);
            wait.until(ExpectedConditions.elementToBeClickable(cartLink));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
            cart.click();
            return new CartPage(driver);
        }
        else if(items.length>0 && items.length<=availableItems.size()){
            for (int item : items) {
                wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(addToCartButton, item));
                driver.findElements(addToCartButton).get(item).click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.added_to_cart")));
            }
                wait.until(ExpectedConditions.elementToBeClickable(cartLink));
                WebElement cart = driver.findElement(cartLink);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
                cart.click();
                return new CartPage(driver);
            }
        else if(availableItems.size()<items.length){
                System.out.println(availableItems.size());
            }
    return null;
}
}
