package forget_password;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.forgetPassword;
import pages.areapage;

public class Forget_password_tests extends BaseTests {
@Test
public void test_succesful_login(){
     forgetPassword forget =home.forgetPassword_click();
    forget.set_email("test@gmail.com");
    forget.click();

    //Assert.assertTrue(area.get_text().contains("You logged into a secure area!") );
}
}
