package WYSIWYGT;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.WYSIWYG;

import java.util.concurrent.TimeUnit;

public class WYSTest extends BaseTests {
    @Test
    public void Tescase1() throws InterruptedException {
        WYSIWYG editorPage=home.WYSIWYGClick();
        //TimeUnit.SECONDS.sleep(5);
        editorPage.clear();
        //TimeUnit.SECONDS.sleep(5);
        editorPage.settext("Hello ");
        //TimeUnit.SECONDS.sleep(5);
        editorPage.settext("World");
        //TimeUnit.SECONDS.sleep(5);
        Assert.assertEquals(editorPage.getText(),"Hello World");
    }
}
