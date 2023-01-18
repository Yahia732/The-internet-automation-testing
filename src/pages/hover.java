package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class hover {
   private WebDriver driver;
   private By box_caption=By.className("figcaption");
   private By figure_box=By.className("figure");
    public hover( WebDriver driver){
        this.driver=driver;
    }
    public  figure_action hoverOverFigure(int index){
        Actions actions=new Actions(driver);
        WebElement figure=driver.findElements(figure_box).get(index);
        actions.moveToElement(figure).perform();
        return new figure_action(figure.findElement(box_caption));
    }
    public class figure_action{
       private WebElement caption;
       private By header=By.tagName("h5");
private By link=By.tagName("a");

       public figure_action(WebElement caption){
           this.caption=caption;
       }
       public boolean isdisplayed(){


           return caption.isDisplayed();
       }
       public String get_title(){
         return   caption.findElement(header).getText();
       }
        public String get_link(){
            return   caption.findElement(link).getAttribute("href");
        }
        public String get_linktext(){
            return   caption.findElement(link).getText();
        }
    }
}
