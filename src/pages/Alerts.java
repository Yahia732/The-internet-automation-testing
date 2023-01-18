package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
private WebDriver driver;
private By trigger_alert=By.xpath("//button[text()='Click for JS Alert']");
    private By trigger_confirm=By.xpath("//button[text()='Click for JS Confirm']");
    private By trigger_prompt=By.xpath("//button[text()='Click for JS Prompt']");
private By message=By.id("result");
public Alerts(WebDriver driver){
    this.driver=driver;
}
public void triggerAlert(){
    driver.findElement(trigger_alert).click();
}
public void triggerConfirm(){
        driver.findElement(trigger_confirm).click();
    }
    public void triggerPrompt(){
        driver.findElement(trigger_prompt).click();
    }
public void acceptAlert(){
    driver.switchTo().alert().accept();;
}
public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
public String getMessage(){
    return driver.findElement(message).getText();
}
    public void sendtext(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
