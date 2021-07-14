package Lesson11.Example2Bridge;

public class TestClient {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle());
        redCircle.draw();

        Shape blueCircle = new Circle(new BlueCircle());
        blueCircle.draw();
    }
}
