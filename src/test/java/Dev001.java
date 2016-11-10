import org.junit.Assert;
import org.junit.Test;

/**
 * Created by snb on 11/8/2016.
 */
public class Dev001 {

    @Test
    public void test1()
    {
        System.out.println("Dev1 testing");
    }

    @Test
    public void test2()
    {

        Assert.fail("Dev fail");
    }
}
