package Lesson07.Example5;

public class Example5BasicSolution {

    static class Bird {
    }

    static class FlyingBird extends Bird {

        void fly() {
        }
    }

    static class SwimmingBird extends Bird {

    }

    static class Duck extends FlyingBird {

    }

    static class NonFlyingBird extends Bird {
    }

    static class Penguin extends NonFlyingBird {

    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        Penguin p = new Penguin();
        // p.fly(); //Problem

    }

}
