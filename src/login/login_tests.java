package login;

import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.Homepage;
import pages.LoginPage;
import pages.areapage;

public class login_tests extends BaseTests {
    @Test

    public void test_succesful_login(){
LoginPage log =home.click();
        log.setUsername("tomsmith");
        log.setPassword("SuperSecretPassword!");
        areapage area= log.login();

        Assert.assertTrue(area.get_text().contains("You logged into a secure area!") );
    }

}
