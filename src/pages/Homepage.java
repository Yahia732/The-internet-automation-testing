package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;
    }
  public LoginPage click(){
        click_link("Form Authentication");
        return new LoginPage(driver);
  }
  private void click_link(String Link){
      driver.findElement(By.linkText(Link)).click();
  }
  public DropDown dropdown_click(){
        click_link("Dropdown");
        return new DropDown(driver);
    }
    public forgetPassword forgetPassword_click(){
        click_link("Forgot Password");
        return new forgetPassword(driver);
    }
    public hover clickhover(){
        click_link("Hovers");
        return new hover(driver);
    }
    public KeyPress clickKeyPress(){
        click_link("Key Presses");
        return new KeyPress(driver);
    }
    public HorizontelSlider clickSlider(){
        click_link("Horizontal Slider");
        return new HorizontelSlider(driver);
    }
}
