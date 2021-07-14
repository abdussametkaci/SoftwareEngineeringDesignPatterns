package Lesson11.Example3Composite;

public class Developer implements IEmployee {

    String firstName, lastName;

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override

    public void showName() {
        System.out.println("Developer " + firstName + " " + lastName);
    }

}
