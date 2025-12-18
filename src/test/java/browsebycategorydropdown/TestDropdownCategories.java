package browsebycategorydropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


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
    public void testBrowseMenJeansCategory() {
        String categoryValue = "mens-jeans";
        String expectedCategory = "Men’s Jeans";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseMenShirtsCategory() {
        String categoryValue = "mens-shirts";
        String expectedCategory = "Men’s Shirts";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseMenShoesCategory() {
        String categoryValue = "mens-shoes";
        String expectedCategory = "Men’s Shoes";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowsePurse_HandBagsCategory() {
        String categoryValue = "purses-and-handbags";
        String expectedCategory = "Purses And Handbags";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseWomenJeansCategory() {
        String categoryValue = "womens-jeans";
        String expectedCategory = "Women’s Jeans";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseWomenShirtsCategory() {
        String categoryValue = "womens-shirts";
        String expectedCategory = "Women’s Shirts";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseWomenShoesCategory() {
        String categoryValue = "womens-shoes";
        String expectedCategory = "Women’s Shoes";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseMenCategory() {
        String categoryValue = "men";
        String expectedCategory = "Men";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseWomenCategory() {
        String categoryValue = "women";
        String expectedCategory = "Women";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

    @Test
    public void testBrowseAccessoriesCategory() {
        String categoryValue = "accessories";
        String expectedCategory = "Accessories";

        var storePage = homePage.clickStore();
        var chosenProductCategoryPage =
                storePage.browserProductCategory(categoryValue);

        String actualResult = chosenProductCategoryPage.getProductsCategory();
        assertTrue(actualResult.contains(expectedCategory),
                "Expected category to contain: " + expectedCategory);
    }

}
