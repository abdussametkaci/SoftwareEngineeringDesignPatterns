package Lesson13.Example4CoR;

public class Chain {

    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new PositiveProcessor(new NegativeProcessor(null));
    }

    void process(int inputNumber) {
        chain.process(inputNumber);
    }

}
