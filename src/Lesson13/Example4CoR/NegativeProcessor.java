package Lesson13.Example4CoR;

public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(int inputNumber) {
        if (inputNumber < 0) {
            System.out.println("Negative Handler work");
        } else {
            super.process(inputNumber); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
