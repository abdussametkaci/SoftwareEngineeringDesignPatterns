package Lesson09.Example2;

public class ShapeFactory {

    enum ShapeType {
        SQUARE,
        RECTANGLE
    }

    public Shape createShape(ShapeType shapeType) {
        Shape temp = null;
        if (shapeType == ShapeType.RECTANGLE) {
            temp = new Rectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            temp = new Square();
        }
        return temp;
    }

    public Shape createShapeWithStringParameter(String shapeType) {
        Shape temp = null;
        if (shapeType.equals("RECTANGLE")) {
            temp = new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            temp = new Square();
        }
        return temp;
    }
}
