package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
   protected WebDriver driver ;
    private By billing_Firstname =By.id("billing_first_name");
    private By billing_Lastname = By.id("billing_last_name");
    private By billingCompanyName = By.id("billing_company");
    private By billing_Streetaddress =By.id("billing_company");
    private By billing_Country = By.id("billing_country");
    private By billing_address1 = By.id("billing_address_1");
    private By billing_address2 = By.id("billing_address_2");
    private By billing_city = By.id("billing_city");
    private By billing_state = By.id("billing_state");
    private By billing_postcode = By.id("billing_postcode");
    private By billing_phone = By.id("billing_phone");
    private By billing_email = By.id("billing_email");
    private By createaccount = By.id("createaccount");
    private By ship_to_different_address_checkbox= By.id("ship-to-different-address-checkbox");
    private By order_comments = By.id("order_comments");
    private By paymentMethod = By.cssSelector("ul.payment_methods li label");
     public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillForm(){

    }
}
