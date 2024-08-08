package OOPS.assignment_5.player;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player();
        CDPlayer cd = new CDPlayer();
        StreamingPlayer sp = new StreamingPlayer();

        mp3.play();
        mp3.pause();
        mp3.stop();

        cd.play();
        cd.pause();
        cd.stop();

        sp.play();
        sp.pause();
        sp.stop();
    }
}
