package browsebycategorydropdown;

import base.BaseTests;
import org.testng.annotations.Test;


public class TestDropdownCategories extends BaseTests {
    // Option 1: value="accessories" -> Accessories  (3)
    // Option 2: value="mens-jeans" -> Men’s Jeans  (4)
    // Option 3: value="mens-shirts" -> Men’s Shirts  (1)
    // Option 4: value="mens-shoes" -> Men’s Shoes  (1)
    // Option 5: value="purses-and-handbags" -> Purses And Handbags  (1)
    // Option 6: value="women" -> Women  (7)
    // Option 7: value="womens-jeans" -> Women’s Jeans  (2)
    // Option 8: value="womens-shirts" -> Women’s Shirts  (1)
    // Option 9: value="womens-shoes" -> Women’s Shoes  (1)
    // Option 10: value="men" -> Men  (7)
    @Test
    public void testBrowseMenJeansCategory(){
        String value = "Men’s Jeans  (4)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseMenShirtsCategory(){
        String value = "Men’s Shirts  (1)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseMenShoesCategory(){
        String value = "Men’s Shoes  (1)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }

    @Test
    public void testBrowsePurse_HandBagsCategory(){
        String value = "Purses And Handbags  (1)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseWomenJeansCategory(){
        String value = "Women’s Jeans  (2)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }

    @Test
    public void testBrowseWomenShirtsCategory(){
        String value = "Women’s Shirts  (1)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }

    @Test
    public void testBrowseWomenShoesCategory(){
        String value = "Women’s Shoes  (1)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseMenCategory(){
        String value = "men";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseWomenCategory(){
        String value = "Women  (7)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }
    @Test
    public void testBrowseAccessoriesCategory(){
        String value = "Accessories  (3)";
        var storePage = homePage.clickStore();
        storePage.browserProductCategory(value);
    }

}
