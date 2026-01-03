package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private By checkoutButton = By.cssSelector("a[class^='checkout-button']");
    protected   WebDriver driver;
    protected WebDriverWait wait;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
public CheckoutPage clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
        return new CheckoutPage(driver);
}
    private By emptyCartStatus = By.cssSelector(".cart-empty.woocommerce-info");
    public String getEmptyCartStatus(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(emptyCartStatus));
        return driver.findElement(emptyCartStatus).getText();
    }
}
