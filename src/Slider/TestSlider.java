package Slider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.HorizontelSlider;
import pages.KeyPress;

public class TestSlider extends BaseTests {
    @Test
    public void test_backspace(){
        HorizontelSlider press= home.clickSlider();
        press.select_slider();
        for (int i =0;i<3;i++) {
            press.move_slider(Keys.ARROW_RIGHT);
        }
        Assert.assertEquals(press.get_Range(),"4");
    }
}
