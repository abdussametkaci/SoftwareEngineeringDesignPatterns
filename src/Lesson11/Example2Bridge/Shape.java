package Lesson11.Example2Bridge;

public abstract class Shape {

    IDrawColor colorObject;

    public Shape(IDrawColor colorObject) {
        this.colorObject = colorObject;
    }

    void draw() {
        colorObject.drawColored();
    }
}
