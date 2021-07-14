package Lesson13.Example4CoR;

public abstract class Processor {

    private Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(int InputNumber) {
        nextProcessor.process(InputNumber);
    }
}
