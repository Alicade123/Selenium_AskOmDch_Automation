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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String  setCredentials(String username , String passcode){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(passcode);
        driver.findElement(submitButton).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(statusText)));
        return driver.findElement(statusText).getText();
    }

        private By reg_usernamefield = By.id("reg_username");
        private By reg_emailField = By.id("reg_email");
        private By reg_passwordField = By.id("reg_password");
        private By reg_submitButton = By.name("register");

    public String setCredentialsRegister(String username, String email, String password){
        driver.findElement(reg_usernamefield).sendKeys(username);
        driver.findElement(reg_emailField).sendKeys(email);
        driver.findElement(reg_passwordField).sendKeys(password);
        driver.findElement(reg_submitButton).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(statusText)));
        return driver.findElement(statusText).getText();
    }
    private By logoutLink = By.partialLinkText("Log out");
    private By loginButton = By.name("login");
    public boolean logout(){
        driver.findElement(logoutLink).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginButton)));
        return  driver.findElement(loginButton).isDisplayed();
    }

}
