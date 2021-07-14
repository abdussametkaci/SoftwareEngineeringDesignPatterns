package Lesson13.Example2Proxy;

public class SystemProxy implements ISystem {

    @Override
    public void doSomething() {
        System.out.println("Securiy check");
        RealSystem rs = new RealSystem();
        rs.doSomething();
        System.out.println("Add access log");
    }

}
