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
        driver.findElement(By.partialLinkText(element)).click();
    }

    //2. Method to click Account link
    public  AccountManagerPage clickAccount(){
        clickElement("Account");
        return new AccountManagerPage(driver);
    }

    //3. click AskOmDch
    public HomePageNavigation clickNavigation(){
        clickElement("AskOmDch");
        return new HomePageNavigation(driver);
    }

    //4. click Store
    public Store clickStore(){
        clickElement("Store");
        return new Store(driver);
    }
    //5. Click Shop Now
    public StorePage ClickShopNow(){
        clickElement("Store");
        return new StorePage(driver);
    }

}
