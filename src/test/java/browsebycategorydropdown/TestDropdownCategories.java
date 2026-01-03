package browsebycategorydropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestDropdownCategories extends BaseTests {
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
