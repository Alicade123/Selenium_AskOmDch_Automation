package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class StorePageSlider {

    protected WebDriver driver;
    private By sliderForm = By.className("price_slider_wrapper");
    private By leftSlider = By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default:nth-child(2)");
    private By rightSlider = By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default:nth-child(3)");
    private By minPriceValue = By.id("min_price");
    private By maxPriceValue = By.id("max_price");
    private By filterButton = By.cssSelector("button[type='submit'].button");

    public StorePageSlider( WebDriver driver){
        this.driver = driver;
    }
public int [] slider(int min, int max){
    Actions actions = new Actions(driver);
    WebElement priceSliderForm = driver.findElement(sliderForm);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", priceSliderForm);
    actions.clickAndHold(driver.findElement(leftSlider)).moveByOffset(min, 0).release().perform();
    actions.clickAndHold(driver.findElement(rightSlider)).moveByOffset(max,0).release().perform();
    int minValue = Integer.parseInt(driver.findElement(minPriceValue).getAttribute("value"));
    int maxValue = Integer.parseInt(driver.findElement(maxPriceValue).getAttribute("value"));
    driver.findElement(filterButton).click();
    return new int[] {minValue,maxValue};
}
public int [] sliderJs(int min, int max){
    WebElement priceSliderForm = driver.findElement(sliderForm);
    ((JavascriptExecutor)driver)
            .executeScript("arguments[0].scrollIntoView({block:'center'});"
                            +"document.getElementById('min_price').value=arguments[1];"
                         +"document.getElementById('max_price').value=arguments[2];",priceSliderForm,min,max);
    int minValue = Integer.parseInt(driver.findElement(minPriceValue).getAttribute("value"));
    int maxValue = Integer.parseInt(driver.findElement(maxPriceValue).getAttribute("value"));
    driver.findElement(filterButton).click();
    return new int[]{minValue,maxValue};
    }
}
