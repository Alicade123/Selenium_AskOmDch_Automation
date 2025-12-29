package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SliderTests extends BaseTests {
    @Test
    public  void priceSliderTest(){
        var storePage = homePage.goToStore();
        int [] priceRange = storePage.slider(50, -50);
        System.out.println(priceRange[0]+" - "+priceRange[1]);
        assertTrue(priceRange[0]<=priceRange[1],"Alicade 🫵🏿 you messed up all things 💀");
    }

    @Test
    public  void priceSliderTestJS(){
        var storePage = homePage.goToStore();
        assertTrue(storePage.sliderJs(100,10),"Alicade 🫵🏿 you messed up all things 💀");
    }
}
