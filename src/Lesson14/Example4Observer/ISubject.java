package Lesson14.Example4Observer;

public interface ISubject {

    void addObserver(IObserver o);

    void notifyObservers();
}
