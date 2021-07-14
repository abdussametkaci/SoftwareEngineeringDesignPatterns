package Lesson14.Example6Stategy;

public class TestClient {

    public static void main(String[] args) {
        Context c = new Context(new AddOperation());
        System.out.println(c.executeStrategy(3, 2));
        c.operationStrategy = new MinusOperation();
        System.out.println(c.executeStrategy(3, 2));
    }
}
