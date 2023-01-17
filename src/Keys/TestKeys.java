package Keys;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.KeyPress;

public class TestKeys extends BaseTests {
@Test
    public void test_backspace(){
    KeyPress press= home.clickKeyPress();
    press.enterText("A"+ Keys.BACK_SPACE);
    Assert.assertEquals(press.getResult(),"You entered: BACK_SPACE");
}
}
