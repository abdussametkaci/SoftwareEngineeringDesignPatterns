package Lesson09.Example1EagerSP;

public class SingletonClass {

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        return instance;
    }

    static {
        instance = new SingletonClass();
    }

    private SingletonClass() {
    }

}
