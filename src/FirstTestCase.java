import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstTestCase {
    @Test
    public void shouldAnswerWithTrue() {
        // System.out.println("Hello world");
        Assert.assertEquals("Yahia", "Yahia");
    }
    @Test
    public void shouldAnswer() {
        // System.out.println("Hello world");
        Assert.assertNotEquals("Yaha", "Yahia");
    }
}
