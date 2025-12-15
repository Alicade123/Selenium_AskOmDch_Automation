package productssorting;

import base.BaseTests;
import org.testng.annotations.Test;

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
        storePage.sortProducts(sortingRule);
    }

}
