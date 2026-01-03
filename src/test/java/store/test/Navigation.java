package store.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
    @Test
    public void testNavigation(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().fullscreen();
        driver.navigate().to("https://rw.wikipedia.org/wiki/Intangiriro");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
