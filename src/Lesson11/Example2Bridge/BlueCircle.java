package Lesson11.Example2Bridge;

public class BlueCircle implements IDrawColor {

    @Override
    public void drawColored() {
        System.out.println("This is a blue circle");
    }

}
