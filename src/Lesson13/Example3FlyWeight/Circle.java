package Lesson13.Example3FlyWeight;

public class Circle implements Shape {

    String colorKey;

    public Circle(String colorKey) {
        this.colorKey = colorKey;
    }

    @Override
    public void draw() {
        System.out.println("Draw a " + colorKey + " circle");
    }

}
