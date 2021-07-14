package Lesson09.Example2;

public class Test {

    public static void main(String[] args) {
        ShapeFactory f = new ShapeFactory();
        Shape r = f.createShape(ShapeFactory.ShapeType.RECTANGLE);
        System.out.println(r.toString());
    }
}
