package Lesson10.Example2Builder;

public class EmployeeWithComplexCostructionProcess {

    String firstName, lastName, department;
    int salary;

    public EmployeeWithComplexCostructionProcess(String firstName, String lastName, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeWithComplexCostructionProcess(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeWithComplexCostructionProcess(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
