package productssorting;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class SortTests extends BaseTests {
    //Todo:Sorting Parameters
    //1. value = "menu_order" -> Default sorting
    //2. value = "popularity" -> Sort by Popularity
    //3. value = "rating" -> sort by average rating
    //3. value = "date" -> sort by latest
    //3. value ="price"-> Sort by price: low to high
    //3. value ="price-desc" -> Sort by price: high to low
    @Test
    public void testDefaultSorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="price";
        storePage.sortProducts(sortingRule);
    }

    @Test
    public void testPopularitySorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="popularity";
        storePage.sortProducts(sortingRule);
    }
    @Test
    public void testAverageRatingSorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="rating";
        storePage.sortProducts(sortingRule);
    }
    @Test
    public void testLatestSorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="date";
        storePage.sortProducts(sortingRule);
    }
    @Test
    public void testPriceL_HSorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="price";
        storePage.sortProducts(sortingRule);
    }
    @Test
    public void testPriceH_LSorting(){
        var storePage = homePage.clickStore();
        String sortingRule ="price-desc";
        String actualResultPageUrl = storePage.sortProducts(sortingRule);
        System.out.println(actualResultPageUrl);
        assertTrue(actualResultPageUrl.endsWith(sortingRule));
    }
    @Test
    public void testAllSortingRulesAtOnce(){

        String rule1 = "menu_order";
        String rule2 = "popularity";
        String rule3 =  "rating";
        String rule4 = "date";
        String rule5  ="price";
        String rule6   ="price-desc";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule1).endsWith(rule1));
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule2).endsWith(rule2));
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule3).endsWith(rule3));
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule4).endsWith(rule4));
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule5).endsWith(rule5));
        softAssert.assertTrue(homePage.clickStore().sortProducts(rule6).endsWith(rule6));
        softAssert.assertAll();
    }

}
