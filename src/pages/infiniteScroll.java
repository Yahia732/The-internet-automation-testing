package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class infiniteScroll {
  private WebDriver driver;
  private By block= By.id("jscroll-added");
  public infiniteScroll(WebDriver driver){
      this.driver=driver;
  }
  public void scrollToParagraoh(int index){
      String script="window.scrollTo(0,document.body.scrollHeight)";
      while(getNumber()>index-1){
          ((JavascriptExecutor)driver).executeScript(script);
      }
  }
  private int getNumber(){
      return driver.findElements(block).size();
  }
}
