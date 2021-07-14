package Lesson14.Example4Observer;

public class StringObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getValue() + " changed");
    }

}
