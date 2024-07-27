package OOPS.assignment_2.movies;

import java.util.*;
enum Genres{
    HORROR,HISTORICAL,OSCAR,SCIENCE;
}
public class MovieLibrary {
    private List<Movie> horrorMovies;
    private List<Movie> hisoricalMovies;
    private List<Movie> scienceFictionMovies;
    private List<Movie> oscarMovies;

    MovieLibrary(){
        horrorMovies = new ArrayList<>();
        hisoricalMovies = new ArrayList<>();
        scienceFictionMovies = new ArrayList<>();
        oscarMovies = new ArrayList<>();
    }

    public void getHorrorMovies() {
        for(Movie hm : horrorMovies) {
            System.out.println(hm.toString());
        }
    }

    public void getHisoricalMovies() {
        for(Movie hm : hisoricalMovies) {
            System.out.println(hm.toString());
        }
    }
    public void getScienceFictionMovies() {
        for(Movie hm : scienceFictionMovies) {
            System.out.println(hm.toString());
        }
    }
    public void getOscarMovies() {
        for(Movie hm : oscarMovies) {
            System.out.println(hm.toString());
        }
    }
    public void addMovie(Genres genre ,Movie... movie){
        switch (genre){
            case HORROR:{
                horrorMovies.addAll(Arrays.asList(movie));break;
            }
            case HISTORICAL:{
                hisoricalMovies.addAll(Arrays.asList(movie));break;
            }
            case OSCAR:{
                oscarMovies.addAll(Arrays.asList(movie));break;
            }
            case SCIENCE:{
                scienceFictionMovies.addAll(Arrays.asList(movie));break;
            }
        }
    }

    public static void main(String[] args) {
        Movie killbill = new Movie("Kill Bill","kill bill desc");
        killbill.setReview(5);
        Movie shutterIsland = new Movie("Shutter Island","desc");
        shutterIsland.setReview(5);

        Movie ragingBull = new Movie("Raging Bull","This is a movie description of raging bull");
        Map<String,String> casts = new HashMap<>();
        casts.put("hero","Robert deniro");
        casts.put("supporting","joe pesci");
        ragingBull.setCasts(casts);
        ragingBull.setReview(5);
        ragingBull.setReview(4);
        ragingBull.setReview(1);

        Genres genres = Genres.HORROR;

        MovieLibrary library = new MovieLibrary();

        library.addMovie(genres,killbill,shutterIsland,ragingBull);

        library.getHorrorMovies();

    }

}
