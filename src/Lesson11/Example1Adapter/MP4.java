package Lesson11.Example1Adapter;

public class MP4 implements INewMediaPlayerAdapter {

    @Override
    public void playNew() {
        System.out.println("Playing MP4");
    }

}
