package Hover;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.Homepage;
import pages.hover;
import pages.hover.figure_action;
public class testHover extends BaseTests {
    @Test
    public void testUser1(){
        hover hoverspage= home.clickhover();
        figure_action caption= hoverspage.hoverOverFigure(0);
        Assert.assertTrue(caption.isdisplayed());
        Assert.assertEquals(caption.get_title(),"name: user1");
        Assert.assertEquals(caption.get_linktext(),"View profile");
        Assert.assertTrue(caption.get_link().endsWith("/users/1"));
    }
}
