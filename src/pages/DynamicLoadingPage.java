package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By linkexample=By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By linkexample2=By.xpath(String.format(linkXpath_Format, "Example 2"));
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public DynamicLoadingPage1 Loadingclick(){
        driver.findElement(linkexample).click();
        return new DynamicLoadingPage1(driver);
    }
    public DynamicLoadingPage2 Loadingclick2(){
        driver.findElement(linkexample2).click();
        return new DynamicLoadingPage2(driver);
    }
}
