public class Surgeon extends Doctor implements MedicalDuties {
    boolean isOperating;

    public Surgeon(String name, String employeeNumber, String specialty, boolean isOperating) {
        super(name, employeeNumber, specialty);
        salary = 120000;
        this.isOperating = isOperating;
    }

    public boolean ifOperating() {
        return isOperating;
    }

    @Override
    public String toString() {
        return super.toString() + isOperating;
    }
}
