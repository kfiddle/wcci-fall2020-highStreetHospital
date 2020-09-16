import java.util.ArrayList;

public class Hospital {
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void displayPayRates() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " gets paid  " + employee.getSalary());
        }
    }

    public void showMedicalEmployees() {
        for (Employee employee : employees){
            if (employee instanceof MedicalDuties){
                System.out.println(employee.getName() + "  can do medical stuff");
            }

    }

}

}
