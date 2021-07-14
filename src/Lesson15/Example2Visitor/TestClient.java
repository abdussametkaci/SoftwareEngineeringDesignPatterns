package Lesson15.Example2Visitor;

import java.util.ArrayList;

public class TestClient {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3, 5));
        shapes.add(new Circle(3));
        shapes.add(new Circle(5));
        for (Shape shape : shapes) {
            shape.visit(new ShapeRectangleVisitor());
        }

    }
}
