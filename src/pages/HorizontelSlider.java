package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontelSlider {
    private WebDriver driver;
    private By container=By.cssSelector(".sliderContainer input");
    private By range=By.id("range");
    public HorizontelSlider(WebDriver driver){
        this.driver=driver;
    }
    public void select_slider() {
        driver.findElement(container).click();
    }
    public void move_slider(Keys steps){


    driver.findElement(container).sendKeys(steps);

    }
    public String get_Range (){
        return driver.findElement(range).getText();
    }
}
