package Lesson12.Example4Decorator;

public class TestClient {

    public static void main(String[] args) {
        Shape circle = new Circle();
        //  circle.draw();

        Shape borderedCircle = new BorderedShapeDecorator(new Circle());
        borderedCircle.draw();

    }
}
