package OOPS.assignment_5.player;

public class CDPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("CD player is playing");
    }

    @Override
    public void pause() {
        System.out.println("CD player is paused");
    }

    @Override
    public void stop() {
        System.out.println("CD player stopped");
    }
}
