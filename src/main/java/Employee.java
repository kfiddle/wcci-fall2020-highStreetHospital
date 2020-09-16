abstract class Employee {
    protected String name;
    protected String employeeNumber;
    protected int salary;

    public Employee(String name, String employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public int getSalary() {
        return salary;
    }


    public String toString() {
        return String.format("%s  %s", name, employeeNumber);
    }

}
