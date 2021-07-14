package Lesson14.Example5State;

public class StartState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("the object in start state");
        c.setState(this);
    }

}
