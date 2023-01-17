package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class areapage {
    private WebDriver driver;
    private By alert= By.id("flash");
        public areapage(WebDriver driver) {
            this.driver = driver;
        }
        public String get_text(){
        return driver.findElement(alert).getText();
        }
    }

