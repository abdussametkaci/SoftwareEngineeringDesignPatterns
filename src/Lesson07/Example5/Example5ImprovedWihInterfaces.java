package Lesson07.Example5;

public class Example5ImprovedWihInterfaces {

    interface Flyeable {

        void fly();
    };

    interface Swimmeable {

        void swim();
    };

    static class Bird {
    }

    static class Duck implements Flyeable, Swimmeable {

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }
    }

    static class Penguin implements Swimmeable {

        @Override
        public void swim() {

        }
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        Penguin p = new Penguin();
        //p.fly(); //Problem
    }

}
