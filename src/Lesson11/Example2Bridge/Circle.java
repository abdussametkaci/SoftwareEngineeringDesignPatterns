package Lesson11.Example2Bridge;

public class Circle extends Shape {

    public Circle(IDrawColor colorObject) {
        super(colorObject);
    }

}
