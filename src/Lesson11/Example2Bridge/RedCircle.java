package Lesson11.Example2Bridge;

public class RedCircle implements IDrawColor {

    @Override
    public void drawColored() {
        System.out.println("This is red circle");
    }

}
