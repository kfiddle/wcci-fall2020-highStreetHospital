import org.junit.Assert;
import org.junit.Test;

public class JanitorTest {

    Janitor larry = new Janitor("Larry", "98765", true);

    @Test
    public void canJanitorSweep(){
        Assert.assertEquals(true, larry.ifSweeping());
    }



}
