package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


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
    private By placeOrderButton = By.id("place_order");

     public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillDetails (String firstname, String lastname, String company, String street, String country,
                             String address1, String address2, String city, String state, String postcode, String phone,
                             String email, String comment, String payment
    ){
        driver.findElement(billing_Firstname).sendKeys(firstname);
        driver.findElement(billing_Lastname).sendKeys(lastname);
        driver.findElement(billingCompanyName).sendKeys(company);
        driver.findElement(billing_Streetaddress).sendKeys(street);
        new Select(driver.findElement(billing_Country)).selectByVisibleText(country);
        driver.findElement(billing_address1).sendKeys(address1);
        driver.findElement(billing_address2).sendKeys(address2);
        driver.findElement(billing_city).sendKeys(city);
        new Select(driver.findElement(billing_state)).selectByVisibleText("Wyoming");
        driver.findElement(billing_postcode).sendKeys(postcode);
        driver.findElement(billing_phone).sendKeys(phone);
        driver.findElement(billing_email).sendKeys(email);
        driver.findElement(order_comments).sendKeys(comment);
        List<WebElement> payments = driver.findElements(paymentMethod);
        for (WebElement pay : payments){
            if(pay.getText().contains(payment)) {
                String forId = pay.getAttribute("for");
                driver.findElement(By.id(forId)).click();
            }
        }
        driver.findElement(placeOrderButton).click();
    }
}
