import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {


    Doctor testDoctor1 = new Doctor("name", "123", "noses");
    Patient testPatient = new Patient();

    @Test
    public void testIfBloodIsDrawn() {
        int firstBlood = testPatient.getBloodLevel();
        testDoctor1.drawBlood(testPatient);
        int secondBlood = testPatient.getBloodLevel();
        Assert.assertEquals(5, firstBlood - secondBlood);
        }

    @Test
    public void testCaringForPatient() {
        int firstHealthNumber = testPatient.getHealth();
        testDoctor1.careForPatient(testPatient);
        int secondHealthNumber = testPatient.getHealth();
        Assert.assertEquals(10, secondHealthNumber - firstHealthNumber);
    }



}
