package DyanmicPage2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.DynamicLoadingPage1;
import pages.DynamicLoadingPage2;

public class DynamicPage2Test extends BaseTests {
    @Test
    public void Testcase1() {
        DynamicLoadingPage2 page = home.LoadingClick().Loadingclick2();
        page.clickStart();
        Assert.assertTrue(page.getText().contains("Hello World!"));
    }
}