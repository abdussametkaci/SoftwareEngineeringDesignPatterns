package Lesson14.Example3Momento;

public class Originator {

    String state;

    Momento saveState() {
        return new Momento(state);
    }

    Momento getState(CareTaker careTaker, int i) {
        return careTaker.get(i);
    }
}
