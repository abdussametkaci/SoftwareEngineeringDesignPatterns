package Lesson15.Example1Template;

public class TestClient {

    public static void main(String[] args) {
        TemplateClass temp = new ConcreateImp1();
        temp.templateMethod();
        temp = new ConcreateImp2();
        temp.templateMethod();
    }
}
