package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgetPassword {
    private WebDriver driver;
    private By email=By.id("email");
    public forgetPassword(WebDriver driver){
        this.driver=driver;
    }
    public void set_email(String Email){
        driver.findElement(email).sendKeys(Email);
    }
    public void click(){
        driver.findElement(By.cssSelector("#forgot_password button"));
    }
}
