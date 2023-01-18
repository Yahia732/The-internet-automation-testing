package Alert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.FileUpload;

public class FileUploadTests extends BaseTests {
 @Test
 public void test_case1(){
     FileUpload file=home.uploadClick();
     file.file("C:/Users/there/IdeaProjects/tst/src/pages/DropDown.java");
     Assert.assertEquals(file.getfile(),"DropDown.java");
 }
}
