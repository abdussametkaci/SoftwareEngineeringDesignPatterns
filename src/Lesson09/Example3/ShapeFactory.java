package Lesson09.Example3;

public class ShapeFactory implements AbstractFactory {

    enum shapeTypeEnum implements IProductEnum {
        RECTANGLE,
        SQUARE
    }

    public Product create(IProductEnum shapeType) {
        Shape temp = null;
        if (shapeType == ((shapeTypeEnum) shapeType).RECTANGLE) {
            temp = new Rectangle();
        } else if (shapeType == ((shapeTypeEnum) shapeType).SQUARE) {
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
