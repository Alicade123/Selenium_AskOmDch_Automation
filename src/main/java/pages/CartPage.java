package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private By checkoutButton = By.cssSelector("a[class^='checkout-button']");
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
public CheckoutPage clickCheckoutButton(){
        driver.findElements(checkoutButton).click();
        return new CheckoutPage(driver);
}

}
