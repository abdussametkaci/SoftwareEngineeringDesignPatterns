package Lesson14.Example4Observer;

public class NumericalObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getNumber() + " changed");
    }

}
