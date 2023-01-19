package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage2 {
    private WebDriver driver;
    private By startButton=By.cssSelector("#start button");
    private By loading=By.id("loading");
    private By text=By.id("finish");
    public DynamicLoadingPage2(WebDriver driver){
        this.driver=driver;
    }
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(text));
    }
    public String getText(){
        return driver.findElement(text).getText();
    }
}
