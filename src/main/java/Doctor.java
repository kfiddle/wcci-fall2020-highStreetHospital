public class Doctor extends MedicalEmployee implements MedicalDuties {
    private String specialty;


    public Doctor(String name, String employeeNumber, String specialty) {
        super(name, employeeNumber);
        this.specialty = specialty;
        salary = 90000;
    }

    public String getSpecialty() {
        return specialty;
    }
    @Override
    public void drawBlood(Patient patient) {
        patient.removeBlood(5);
    }

    @Override
    public void careForPatient(Patient testPatient) {
        testPatient.improveHealth(10);
    }

    @Override
    public String toString() {
        return super.toString() + "   " + specialty;

    }
}
