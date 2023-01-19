package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYG {
   private WebDriver driver;

   private String editorFrameid="mce_0_ifr";
   private By textarea= By.id("tinymce");
    public WYSIWYG(WebDriver driver){
        this.driver=driver;
    }
    private void switchtoedit(){
       driver.switchTo().frame(editorFrameid);
    }
    public void clear(){
        switchtoedit();
        driver.findElement(textarea).clear();
        switchtomain();
    }
    public void settext(String text){
        switchtoedit();
        driver.findElement(textarea).sendKeys(text);
        switchtomain();
    }
    private void switchtomain(){
        driver.switchTo().parentFrame();
    }

    public String getText(){
        switchtoedit();
        String text= driver.findElement(textarea).getText();
    return text;
    }

}
