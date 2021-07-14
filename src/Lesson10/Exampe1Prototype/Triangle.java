package Lesson10.Exampe1Prototype;

public class Triangle extends ShapePrototype {

    public Triangle() {
        System.out.println("I triangle is created");
    }

    @Override
    void draw() {
        System.out.println("I am a trienagle");
    }
}
