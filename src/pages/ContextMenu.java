package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class ContextMenu {
   private WebDriver driver;
   private By context=By.id("hot-spot");
    public ContextMenu(WebDriver driver){
        this.driver=driver;
    }

    public void clickcontext(){
      WebElement contxt= driver.findElement(context);
        Actions action=new Actions(driver);
        action.contextClick(contxt).perform();


    }
public String gettext(){
    return driver.switchTo().alert().getText();
}
    public void acceptalert(){
         driver.switchTo().alert().accept();
    }
}
