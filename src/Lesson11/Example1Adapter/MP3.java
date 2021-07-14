package Lesson11.Example1Adapter;

public class MP3 implements IOldMediaPlayer {

    @Override
    public void playOld() {
        System.out.println("Playing MP3");
    }

}
