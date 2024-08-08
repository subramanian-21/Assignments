package OOPS.assignment_5.player;

public class MP3Player implements Playable{

    @Override
    public void play() {
        System.out.println("MP3 player is playing");
    }

    @Override
    public void pause() {
        System.out.println("MP3 player paused");
    }

    @Override
    public void stop() {
        System.out.println("MP3 player paused");
    }
}
