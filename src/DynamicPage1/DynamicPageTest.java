package DynamicPage1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.DynamicLoadingPage;
import pages.DynamicLoadingPage1;

public class DynamicPageTest extends BaseTests {

@Test
public void Testcase1(){
    DynamicLoadingPage1 page=home.LoadingClick().Loadingclick();
    page.clickStart();
    Assert.assertTrue(page.getText().contains("Hello World!"));
}
}
