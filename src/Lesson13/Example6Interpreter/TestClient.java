package Lesson13.Example6Interpreter;

public class TestClient {

    static Expression combinedExpression() {
        Expression terminal1 = new TerminalExpression("Ahmet");
        Expression terminal2 = new TerminalExpression("Kemal");
        return new OrExpression(terminal1, terminal2);
    }

    public static void main(String[] args) {

        System.out.println(combinedExpression().interpret("Mehmet"));
    }
}
