package Lesson14.Example3Momento;

public class TestClient {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.state = "Ahmet";
        CareTaker c = new CareTaker();
        c.add(o.saveState());
        //do something
        System.out.println(o.getState(c, 0).getState());
    }
}
