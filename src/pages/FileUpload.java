package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUpload {
  private WebDriver driver;
  private By choosefile=By.id("file-upload");
    private By upload=By.id("file-submit");
    private By uploadedfile=By.id("uploaded-files");
    public FileUpload(WebDriver driver){
        this.driver=driver;
    }
    public void clickupload(){
driver.findElement(upload).click();
    }
    public String getfile(){
        return driver.findElement(uploadedfile).getText();
    }
    public void file(String path){
        driver.findElement(choosefile).sendKeys(path);
        clickupload();
    }
}
