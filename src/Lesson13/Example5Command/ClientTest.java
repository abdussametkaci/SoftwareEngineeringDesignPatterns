package Lesson13.Example5Command;

import javafx.scene.effect.Light;

public class ClientTest {

    public static void main(String[] args) {
        LightReceiver ligth = new LightReceiver();
        Command c = new LigthOnCommand(ligth);
        c.execute();
    }
}
