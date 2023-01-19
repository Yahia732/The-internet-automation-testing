package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
   private WebDriver driver;
   private String leftFrame="frame-left";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");
    private String bottomFrane="frame-bottom";
   public Frames(WebDriver driver){
       this.driver=driver;
   }
   public String getLeftFrame(){
       driver.switchTo().frame(topFrame);
       driver.switchTo().frame(leftFrame);
String text= driver.findElement(body).getText();
driver.switchTo().parentFrame();
       driver.switchTo().parentFrame();
return text;
    }
    public String getButtomFrame(){
        driver.switchTo().frame(bottomFrane);
        String text= driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
