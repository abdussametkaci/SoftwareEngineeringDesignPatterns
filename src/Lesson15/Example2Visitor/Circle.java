package Lesson15.Example2Visitor;

public class Circle implements Shape {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    public void visit(ShapeVisitor visitor) {
        visitor.getArea(this);
    }

}
