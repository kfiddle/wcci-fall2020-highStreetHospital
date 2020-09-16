public class HospitalApp {
    Hospital hospital = new Hospital();

    void go() {

        Doctor sally = new Doctor("Sally", "1234", "noses");
        Nurse rambo = new Nurse("Rambo", "5555", 89);
        Surgeon bettyBoop = new Surgeon("BettyBoo", "9824", "toes", true);
        Receptionist franklin = new Receptionist("Franklin", "3462", true);
        Janitor phyllis = new Janitor("Phyllis", "23546", false);

        hospital.addEmployee(sally);
        hospital.addEmployee(rambo);
        hospital.addEmployee(bettyBoop);
        hospital.addEmployee(franklin);
        hospital.addEmployee(phyllis);

    }

    public static void main(String[] args) {
        HospitalApp app = new HospitalApp();
        app.go();

        app.hospital.showMedicalEmployees();



    }

}
