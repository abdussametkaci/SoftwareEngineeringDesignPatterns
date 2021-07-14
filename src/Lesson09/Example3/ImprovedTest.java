package Lesson09.Example3;

public class ImprovedTest {

    public static void main(String[] args) {
        AbstractFactory f = new ComponentFactory();
        Product p = f.create(ComponentFactory.compType.BUTTON);
        System.out.println(p.toString());
        f = new ShapeFactory();
        p = f.create(ShapeFactory.shapeTypeEnum.RECTANGLE);

    }
}
