package Lesson15.Example1Template;

public abstract class TemplateClass {

    final void templateMethod() {
        operation1();
        operation2();
        operation3();
    }

    abstract void operation1();

    abstract void operation2();

    abstract void operation3();
}
