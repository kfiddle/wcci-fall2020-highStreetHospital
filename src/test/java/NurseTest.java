import org.junit.Assert;
import org.junit.Test;

public class NurseTest {

    Nurse testNurse = new Nurse("name", "number", 5);
    Patient testPatient = new Patient();

    @Test
    public void testIfNurseHasPatients(){
        Assert.assertEquals(5, testNurse.getNumberOfPatients());
    }

    @Test
    public void seeIfNurseIsGettingPaid(){
        Assert.assertEquals(50000, testNurse.getSalary());
    }




    @Test
    public void testIfBloodIsDrawn(){
        int firstBlood = testPatient.getBloodLevel();
        testNurse.drawBlood(testPatient);
        int secondBlood = testPatient.getBloodLevel();
        Assert.assertEquals(5, firstBlood - secondBlood);
    }

    @Test
    public void testCaringForPatient() {
        int firstHealthNumber = testPatient.getHealth();
        testNurse.careForPatient(testPatient);
        int secondHealthNumber = testPatient.getHealth();
        Assert.assertEquals(5, secondHealthNumber - firstHealthNumber);
    }
}



