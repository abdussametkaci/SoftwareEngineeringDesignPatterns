package Lesson13.Example3FlyWeight;

public class TestClient {

    public static void main(String[] args) {
        ShapeFactory.getCircle("Blue");
        ShapeFactory.getCircle("Blue");
        ShapeFactory.getCircle("Yellow");
        ShapeFactory.getCircle("Blue");
        System.out.println(ShapeFactory.getSize());

    }
}
