package Utils;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Set;

public class WindowDriver {
  private   WebDriver driver;
  private  WebDriver.Navigation navigate;
  public WindowDriver(WebDriver driver){
      this.driver=driver;
      navigate=driver.navigate();
  }
  public void goBack(){
      navigate.back();
  }
    public void goForward(){
        navigate.forward();
    }
    public void refresh(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public  void Switchtotab(String tab){
      Set<String> handles= driver.getWindowHandles();
      String Windows[]=new String[handles.size()];
       handles.toArray(Windows);
        for (int i=0;i<Windows.length; i++){
          driver.switchTo().window(Windows[i]);
          if(tab.equals(driver.getTitle())){
              break;
          }
      }
    }
}
