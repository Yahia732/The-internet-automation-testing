package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.Homepage;
import pages.LoginPage;
import pages.areapage;

public class BaseTests {
    private WebDriver driver;
    protected Homepage home;
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        home=new Homepage(driver);

        //System.out.println(driver.getTitle());
        //driver.quit();
    }
@AfterClass
    public void quit(){
          driver.quit();
}
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setup();
        test.quit();
    }
}

