public class Receptionist extends Employee {
private boolean isOnPhone;

    public Receptionist(String name, String employeeNumber, boolean phone) {
        super(name, employeeNumber);
        isOnPhone = phone;
        this.salary = 45000;
    }

    public boolean ifOnPhone() {
        return isOnPhone;
    }

    @Override
    public String toString(){
        return super.toString() + isOnPhone;

    }
}
