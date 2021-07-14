package Lesson13.Example5Command;

public class LigthOffCommand implements Command {

    private LightReceiver ligth;

    public LigthOffCommand(LightReceiver ligth) {
        this.ligth = ligth;
    }

    @Override
    public void execute() {
        ligth.off();
    }
}
