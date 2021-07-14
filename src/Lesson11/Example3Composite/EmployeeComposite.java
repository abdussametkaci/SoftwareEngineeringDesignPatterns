package Lesson11.Example3Composite;

import java.util.ArrayList;

public class EmployeeComposite implements IEmployee {

    String firstName, lastName;
    ArrayList<IEmployee> employees = new ArrayList();

    @Override
    public void showName() {
        System.out.println("Composite " + firstName + " " + lastName);
    }

    void addEmployee(IEmployee e) {
        employees.add(e);
    }

    void removeEmployee(IEmployee e) {
        employees.remove(e);
    }

    void listEmployees() {
        for (IEmployee employee : employees) {
            employee.showName();
        }
    }
}
