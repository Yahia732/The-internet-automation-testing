package Frame;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.Frames;


public class FrameTest extends BaseTests {
 @Test
 public void Testcase(){
     Frames frame= home.FramesClick();
     Assert.assertEquals("LEFT",frame.getLeftFrame());
     Assert.assertEquals("BOTTOM",frame.getButtomFrame());
 }
}
