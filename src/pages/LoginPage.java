package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
private By usernamef= By.id("username");
    private By passwordf= By.id("password");
    private By loginb=By.cssSelector("#login button");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(usernamef).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordf).sendKeys(password);
    }
    public areapage login(){
        driver.findElement(loginb).click();
        return new areapage(driver);
    }
}