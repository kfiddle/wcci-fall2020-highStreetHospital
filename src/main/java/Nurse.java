public class Nurse extends MedicalEmployee implements MedicalDuties {
    int numberOfPatients;


    public Nurse(String name, String number, int patients) {
        super(name, number);
        numberOfPatients = patients;
        salary = 50000;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public void drawBlood(Patient patient) {
        patient.removeBlood(5);
    }

    @Override
    public void careForPatient(Patient patient) {
        patient.improveHealth(5);
    }

    @Override
    public String toString() {
        return super.toString() + numberOfPatients;

    }
}
