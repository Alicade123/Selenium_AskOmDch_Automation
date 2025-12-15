package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }
    //1. Helper method to click
    private void clickElement(String element){
        driver.findElement(By.linkText(element)).click();
    }

    //2. Method to click Account link
    public  AccountManagerPage clickAccount(){
        clickElement("Account");
        return new AccountManagerPage(driver);
    }

}
