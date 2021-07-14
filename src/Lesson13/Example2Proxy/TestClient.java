package Lesson13.Example2Proxy;

public class TestClient {

    public static void main(String[] args) {
        ISystem proxy = new SystemProxy();
        proxy.doSomething();
    }
}
