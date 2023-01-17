package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
    private By dropdown= By.id("dropdown");
    public DropDown(WebDriver driver) {
        this.driver = driver;
    }
    public void select(String option){

        find_element().selectByVisibleText(option);
    }
    public List<String> get_elements(){
        return find_element().getAllSelectedOptions().stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select find_element(){
        return new Select(driver.findElement(dropdown));
    }
}
