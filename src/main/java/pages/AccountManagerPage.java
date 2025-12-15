package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountManagerPage {
    protected  WebDriver driver;
    private WebDriverWait wait;
    private By  usernameField = By.id("username");
    private By passwordField  = By.id("password");
    private By submitButton = By.name("login");
    private By statusText = By.cssSelector(".woocommerce-MyAccount-content p");
    public AccountManagerPage(WebDriver driver) {
        this.driver = driver;
    }
    public String  setCredentials(String username , String passcode){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(passcode);
        driver.findElement(submitButton).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(statusText)));
        return driver.findElement(statusText).getText();
    }

}
