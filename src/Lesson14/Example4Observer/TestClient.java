package Lesson14.Example4Observer;

public class TestClient {

    public static void main(String[] args) {
        Subject s = new Subject();
        s.addObserver(new NumericalObserver());
        s.addObserver(new StringObserver());
        s.setNumber(25);
        s.setValue("Ahmet");
    }
}
