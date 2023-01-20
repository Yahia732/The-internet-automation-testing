package Navigation;

import org.testng.annotations.Test;
import pages.BaseTests;

public class NavigationTest extends BaseTests {
    @Test
    public void testNavigator(){
        home.LoadingClick().Loadingclick();
        getWindowManger().goBack();
        getWindowManger().refresh();
        getWindowManger().goForward();
        getWindowManger().goTo("https://google.com/");
    }
    @Test
    public void TestSwicth(){
home.MultipleWindowPageClick().clickhere();
getWindowManger().Switchtotab("New Window");
    }
}
