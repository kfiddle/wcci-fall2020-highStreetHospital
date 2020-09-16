abstract class MedicalEmployee extends Employee implements MedicalDuties {


    public MedicalEmployee(String name, String employeeNumber) {
        super(name, employeeNumber);
    }


    public void drawBlood(Patient patient, int amount) {
        patient.removeBlood(amount);
    }


    @Override
    public String toString() {
      return super.toString();
    }

    public void careForPatient(Patient patient, int amount) {
        patient.improveHealth(amount);

    }



}
