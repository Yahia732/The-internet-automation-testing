package Infinite;

import org.testng.annotations.Test;
import pages.BaseTests;

public class InfiniteTests extends BaseTests {
    @Test
    public void TestCase1(){
        home.ScrollClick().scrollToParagraoh(5);
    }
}
