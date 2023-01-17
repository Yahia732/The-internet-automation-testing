package dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseTests;
import pages.DropDown;

import java.util.List;

public class dropdown_tests extends BaseTests {
@Test
    public void Select_option(){
    DropDown drop =home.dropdown_click();
    String option="Option 1";
drop.select(option);
    List<String> options=drop.get_elements();
    Assert.assertEquals(options.size(),1);
    Assert.assertTrue(options.contains(option));
    }
}
