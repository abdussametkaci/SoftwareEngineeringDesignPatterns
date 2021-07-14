package Lesson14.Example5State;

public class ClientTest {

    public static void main(String[] args) {
        Context c = new Context();
        State s = new StartState();
        s.doAction(c);
        System.out.println(c.getState());
        s = new StopState();
        s.doAction(c);
        System.out.println(c.getState());
    }
}
