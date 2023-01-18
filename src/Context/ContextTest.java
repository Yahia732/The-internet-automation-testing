package Context;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.ContextMenu;

public class ContextTest extends BaseTests {
        @Test
    public void contexttest1(){
            ContextMenu cont=home.contextClick();
            cont.clickcontext();
            String message=cont.gettext();
            cont.acceptalert();
            Assert.assertEquals(message,"You selected a context menu");
        }
}
