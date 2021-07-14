package Lesson15.Example2Visitor;

public class Rectangle implements Shape {

    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void visit(ShapeVisitor visitor) {
        visitor.getArea(this);
    }

}
