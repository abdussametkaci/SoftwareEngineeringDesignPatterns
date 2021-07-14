package Lesson11.Example3Composite;

public class TestClient {

    public static void main(String[] args) {
        EmployeeComposite manager = new EmployeeComposite();
        manager.addEmployee(new Developer("Ahmet", "Ak"));
        manager.addEmployee(new Analist("Kemal", "Sarı"));
        manager.addEmployee(new Analist("Ayşe", "Sarı"));
        manager.listEmployees();
        manager.addEmployee(manager);
        for (IEmployee employee : manager.employees) {
            employee.showName();
            for (IEmployee subEmployees : manager.employees) {
                System.out.print("-->");
                subEmployees.showName();
            }
        }
    }
}
