package Lesson11.Example1Adapter;

public class TestClient {

    public static void main(String[] args) {
        INewMediaPlayerAdapter player = new Adapter(new MP3());
        player.playNew();

        INewMediaPlayerAdapter player1 = new MP4();
        player1.playNew();

        INewMediaPlayerAdapter player2 = new Adapter(new MP2());
        player2.playNew();

    }
}
