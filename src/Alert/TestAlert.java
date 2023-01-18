package Alert;

import org.testng.Assert;
import pages.Alerts;
import pages.BaseTests;
import org.testng.annotations.Test;
public class TestAlert extends BaseTests {
@Test
public void testAlert1()

    {
        Alerts alert = home.alertClick();
        alert.triggerAlert();
    alert.acceptAlert();
        Assert.assertEquals(alert.getMessage(),"You successfully clicked an alert");
    }
@Test
public void TestConfirm(){
        Alerts alert = home.alertClick();
        alert.triggerConfirm();
        alert.cancelAlert();
        Assert.assertEquals(alert.getMessage(),"You clicked: Cancel");
    }
    @Test
    public void TestPrompt(){
    String text="Yahia";
        Alerts alert = home.alertClick();
        alert.triggerPrompt();
        alert.sendtext(text);
        Assert.assertEquals(alert.getMessage(),"You entered: "+text);
    }
}
