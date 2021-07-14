package Lesson13.Example5Command;

public class LigthOnCommand implements Command {

    private LightReceiver ligth;

    public LigthOnCommand(LightReceiver ligth) {
        this.ligth = ligth;
    }

    @Override
    public void execute() {
        ligth.on();
    }
}
