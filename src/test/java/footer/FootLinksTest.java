package footer;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class FootLinksTest extends BaseTests {
    @Test
    public void testAllFooterLinks(){
        SoftAssert softAssert = new SoftAssert();
        String [] footLinks = new String[]{
                "Home","About",  "My Account", "Cart","Contact Us", "Women",  "Women’s Jeans", "Women’s Shirts","Women’s Shoes",                "Accessories",                "Men",
                "Men’s Jeans", "Men’s Shirts",  "Men’s Shoes",  "Accessories"};
        var anyPage = homePage.clickFooter();
        int [] actualResults = anyPage.clickLink(footLinks);
        String [] PageTitles=new String[]{"AskOmDch – Become a Selenium automation expert!", "About – AskOmDch",
                "Account – AskOmDch", "Cart – AskOmDch", "Contact Us – AskOmDch", "Women – AskOmDch", "Women’s Jeans – AskOmDch",
                "Women’s Shirts – AskOmDch", "Women’s Shoes – AskOmDch", "Accessories – AskOmDch", "Men – AskOmDch",
                "Men’s Jeans – AskOmDch", "Men’s Shirts – AskOmDch", "Men’s Shoes – AskOmDch", "Accessories – AskOmDch"};
        String [] PageUrls = new String[]{"https://askomdch.com/", "https://askomdch.com/about/",
                "https://askomdch.com/account/", "https://askomdch.com/cart/", "https://askomdch.com/contact-us/",
                "https://askomdch.com/product-category/women/", "https://askomdch.com/product-category/womens-jeans/",
                "https://askomdch.com/product-category/womens-shirts/"," https://askomdch.com/product-category/womens-shoes/",
                "https://askomdch.com/product-category/accessories/", "https://askomdch.com/product-category/men/",
                "https://askomdch.com/product-category/mens-jeans/", "https://askomdch.com/product-category/mens-shirts/",
                "https://askomdch.com/product-category/mens-shoes/", "https://askomdch.com/product-category/accessories/"};
        softAssert.assertEquals(actualResults[0], PageTitles.length,"Something Went wrong");
        softAssert.assertEquals(actualResults[1], PageUrls.length,"Something Went wrong");
        softAssert.assertAll();


    }
}
