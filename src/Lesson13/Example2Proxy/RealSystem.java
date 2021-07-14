package Lesson13.Example2Proxy;

class RealSystem implements ISystem {

    @Override
    public void doSomething() {
        System.out.println("System working");
    }

}
