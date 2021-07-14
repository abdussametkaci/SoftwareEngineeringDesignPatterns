package Lesson11.Example3Composite;

public class Analist implements IEmployee {

    String firstName, lastName;

    public Analist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showName() {
        System.out.println("Analist " + firstName + " " + lastName);
    }

}
