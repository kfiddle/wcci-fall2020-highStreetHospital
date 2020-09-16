public class Janitor extends Employee {
    private boolean isSweeping;

    public Janitor(String name, String employeeNumber, boolean sweeping) {
        super(name, employeeNumber);
        this.salary = 40000;
        isSweeping = sweeping;
    }

    public boolean ifSweeping() {
        return isSweeping;
    }

    public String toString(){
        return super.toString() + "  " + isSweeping;

    }
}
