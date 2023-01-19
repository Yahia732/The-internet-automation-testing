package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDoms {
   private WebDriver driver;
   private By table= By.id("large-table");
    public LargeAndDeepDoms(WebDriver driver){
        this.driver=driver;

    }
public void findTable(){
      WebElement large_table=driver.findElement(table);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",large_table);

}
}
