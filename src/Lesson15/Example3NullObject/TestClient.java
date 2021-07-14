package Lesson15.Example3NullObject;

public class TestClient {

    public static void main(String[] args) {
        CustomerFactory.addCustomer("Ahmet");
        CustomerFactory.addCustomer("");

        for (AbstractCustomer customer : CustomerFactory.customers) {
            System.out.println(customer.name);
            System.out.println(customer);
        }

    }
}
