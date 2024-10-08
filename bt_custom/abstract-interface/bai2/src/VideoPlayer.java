public class VideoPlayer implements Playable{

    private String name;

    public VideoPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }

    @Override
    public void pause() {
        System.out.println(getName() + " is paused");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is stopped");
    }
}
