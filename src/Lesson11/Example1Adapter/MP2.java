package Lesson11.Example1Adapter;

public class MP2 implements IOldMediaPlayer {

    @Override
    public void playOld() {
        System.out.println("Playing MP2");
    }

}
