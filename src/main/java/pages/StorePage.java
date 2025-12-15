package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private By addToCartButton = By.cssSelector("a[class='button product_type_simple add_to_cart_button ajax_add_to_cart']");
    private By cartLink = By.cssSelector("a[class^='cart-container']");
    public StorePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
//    public CartPage  variousNumberOfItemsToCart(int... quantities){
//        for(int quantity : quantities){
//            driver.findElements(addToCartButton).get(quantity).click();
//        }
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cartLink)));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(cartLink));
//        driver.findElement(cartLink).click();
//        return new CartPage(driver);
//        }
public CartPage variousNumberOfItemsToCart(int... indexes) {
    for (int index : indexes) {
        // Re-locate buttons every time
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(addToCartButton, index));
        driver.findElements(addToCartButton).get(index).click();
        // Optional: wait for AJAX add-to-cart to finish
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.added_to_cart")));
    }
    wait.until(ExpectedConditions.elementToBeClickable(cartLink));
    WebElement cart = driver.findElement(cartLink);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
    cart.click();
    return new CartPage(driver);
}

}
