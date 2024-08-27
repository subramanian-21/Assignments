package CAD.theater;

import java.util.ArrayList;
import java.util.List;

public class BookingApplication {
    List<Theater> theaters;
    public BookingApplication(){
        theaters = new ArrayList<>();
        Theater inox=  new Theater("inox", 5);
        Theater pvr = new Theater("pvr", 8);
        Movie deadpool3d = new Movie("Deadpool", 4, true);
        Movie deadpool = new Movie("Deadpool", 4, false);

        Movie batman3d = new Movie("Batman", 5, true);
        Movie batman = new Movie("Batman", 5, false);

        Movie borderlands3d = new Movie("Borderlands", 5, true);
        Movie borderlands = new Movie("Borderlands", 5, false);

        inox.getScreen("Screen1").setMovie(deadpool3d);
        inox.getScreen("Screen2").setMovie(deadpool);
        inox.getScreen("Screen3").setMovie(batman3d);
        inox.getScreen("Screen4").setMovie(deadpool3d);
        inox.getScreen("Screen5").setMovie(deadpool);

        pvr.getScreen("Screen1").setMovie(deadpool3d);
        pvr.getScreen("Screen2").setMovie(deadpool);
        pvr.getScreen("Screen3").setMovie(batman3d);
        pvr.getScreen("Screen4").setMovie(borderlands);
        pvr.getScreen("Screen5").setMovie(borderlands3d);
        theaters.add(inox);
        theaters.add(pvr);
    }

    public void printTheaters() {
        for (int i = 0;i<theaters.size();i++){
            System.out.println(theaters.get(i).toString());
        }
    }
    public Theater getTheaterById(int id){
        return theaters.get(id-1);
    }
}
