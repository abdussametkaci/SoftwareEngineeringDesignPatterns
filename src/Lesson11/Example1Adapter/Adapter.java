package Lesson11.Example1Adapter;

public class Adapter implements INewMediaPlayerAdapter {

    IOldMediaPlayer oldFormatMedia;

    public Adapter(IOldMediaPlayer oldFormatObject) {
        this.oldFormatMedia = oldFormatObject;
    }

    @Override
    public void playNew() {
        oldFormatMedia.playOld();
    }

}
