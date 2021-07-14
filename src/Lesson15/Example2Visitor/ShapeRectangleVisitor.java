package Lesson15.Example2Visitor;

public class ShapeRectangleVisitor implements ShapeVisitor {

    @Override
    public void getArea(Shape shape) {
        if (shape instanceof Rectangle) {
            int a = ((Rectangle) shape).a;
            int b = ((Rectangle) shape).b;

            System.out.println("The area of rectangle is " + a * b);
        }
    }
}
