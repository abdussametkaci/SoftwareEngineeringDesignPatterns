package Lesson14.Example5State;

public class StopState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("the object in stop state");
        c.setState(this);
    }

}
