package Lesson14.Example3Momento;

import java.util.ArrayList;

public class CareTaker {

    ArrayList<Momento> states = new ArrayList();

    void add(Momento m) {
        states.add(m);
    }

    Momento get(int i) {
        return states.get(i);
    }
}
