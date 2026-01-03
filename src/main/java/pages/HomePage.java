package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

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

    //4. click StoreCategoryBrowser
    public StoreCategoryBrowser clickStore(){
        clickElement("SHOP NOW");
        return new StoreCategoryBrowser(driver);
    }
    //5. Click Shop Now
    public StorePage ClickShopNow(){
        clickElement("SHOP NOW");
        return new StorePage(driver);
    }

    //6. Click Shop Now
    public AboutPage clickAbout(){
        clickElement("About");
        return new AboutPage(driver);
    }
    //7. Click Shop Now
    public FooterLinks clickFooter(){
        return new FooterLinks(driver);
    }
    //8. Click Shop Now
    public StorePageSlider goToStore(){
        clickElement("SHOP NOW");
        return new StorePageSlider(driver);
    }
    //8. go to store page for searching
    public StorePageSearch goToStoreToSearch(){
        clickElement("SHOP NOW");
        return new StorePageSearch(driver);
    }

    //9. AOD on Mobile
    private By stores = By.cssSelector("a[target='_blank']");
    String appStoreTitle = "App Store - Apple (IN)";
    String androidAppStoreTitle = "Android Apps on Google Play";
     public void clickAOD(){
         List<WebElement> storeElements = driver.findElements(stores);
         for(WebElement element : storeElements){
             element.click();
         }
         Set<String> windows = driver.getWindowHandles();
         System.out.println("List of all window handles");
         windows.forEach(System.out::println);
         System.out.println("\n");
         for (String window : windows){
             driver.switchTo().window(window);
             if(driver.getTitle().equals(androidAppStoreTitle)) {
                 System.out.println("We've got the right window: "+driver.getTitle());
                 break;
             }
         }
     }

}
