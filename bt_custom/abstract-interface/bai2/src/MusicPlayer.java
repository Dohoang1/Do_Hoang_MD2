public class MusicPlayer implements Playable{

    private String name;

    public MusicPlayer(String name) {
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
    public void stop() {
        System.out.println(getName() + " is stopping");
    }

    @Override
    public void pause() {
        System.out.println(getName() + " is paused");
    }
}
