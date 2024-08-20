public class Main {
    public static void main(String[] args) {

        MusicPlayer mp = new MusicPlayer("eeee");
        VideoPlayer vp = new VideoPlayer("rrrr");

        mp.play();
        mp.stop();
        vp.play();
        vp.stop();

    }
}