package Lesson14.Example6Stategy;

public class Context {

    Algorithm operationStrategy;

    public Context(Algorithm operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    int executeStrategy(int a, int b) {
        return operationStrategy.doOperation(a, b);
    }
}
