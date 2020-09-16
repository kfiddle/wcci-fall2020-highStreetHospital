import org.junit.Assert;
import org.junit.Test;

public class ReceptionistTest {
    Receptionist betsy = new Receptionist("name", "12345");

    @Test
    public void doesReceptionistHaveASalary(){
        Assert.assertEquals(45000, betsy.getSalary());
    }

}
