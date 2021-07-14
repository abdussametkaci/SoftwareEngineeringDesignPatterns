package Lesson10.Exampe1Prototype;

public class Circle extends ShapePrototype {

    public Circle() {
        System.out.println("I circle is created");
    }

    @Override
    void draw() {
        System.out.println("I am a circle");
    }
}
