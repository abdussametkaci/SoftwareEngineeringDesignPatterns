package Lesson12.Example4Decorator;

public class BorderedShapeDecorator extends ShapeDecorator {

    public BorderedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw(); //To change body of generated methods, choose Tools | Templates.
        addBorder();
    }

    void addBorder() {
        System.out.println("Border is added");
    }

}
