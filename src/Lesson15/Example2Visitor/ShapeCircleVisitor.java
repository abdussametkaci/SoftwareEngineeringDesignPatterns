package Lesson15.Example2Visitor;

public class ShapeCircleVisitor implements ShapeVisitor {

    @Override
    public void getArea(Shape shape) {
        if (shape instanceof Circle) {
            int r = ((Circle) shape).r;
            int PI = 3;
            System.out.println("The area of circle is " + PI * r * r);
        }
    }

}
