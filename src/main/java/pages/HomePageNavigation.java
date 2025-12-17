package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePageNavigation {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public HomePageNavigation(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    private By askOmDch = By.partialLinkText("AskOmDch");
    private By home = By.partialLinkText("Home");
    private By store = By.partialLinkText("StoreCategoryBrowser");
    private By men = By.partialLinkText("Men");
    private By women = By.partialLinkText("Women");
    private By accessories = By.partialLinkText("Accessories");
    private By account = By.partialLinkText("Account");
    private By about = By.partialLinkText("About");
    private By contact_Us = By.partialLinkText("Contact Us");
    private By cart = By.cssSelector("a[class^='cart-container']");

    //1. util method to click
    private void clickElement(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }
    public String clickAskOmDch(){

       clickElement(askOmDch);
       return driver.getTitle();
    }
    public String clickHome(){
        clickElement(home);
        return driver.getTitle();
    }
    public  String clickStore(){
        clickElement(store);
        return driver.getTitle();
    }
    public String clickMen(){
     clickElement(men);
        return driver.getTitle();
    }
    public String clickWomen(){
        clickElement(women);
        return driver.getTitle();
    }
    public String clickAccessories(){
        clickElement(accessories);
        return driver.getTitle();
    }
    public String  clickAccount(){
        clickElement(account);
        return driver.getTitle();
    }
    public String clickAbout(){
        clickElement(about);
        return driver.getTitle();
    }
    public String clickContactUs(){
        clickElement(contact_Us);
        return driver.getTitle();
    }

    public String clickCart(){
        clickElement(cart);
        return driver.getTitle();
    }

}
