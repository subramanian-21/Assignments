package OOPS.assignment_4.movie;

class HorrorMovie extends Movie {
    public HorrorMovie(String movieName, String genre, float ratings) {
        super(movieName, genre, ratings);
    }


    public void display() {
        System.out.println("Horror Movie");
        System.out.println("MovieName: " + this.movieName + "\nGenre: " + this.genre + "\nRatings :" + this.ratings);
    }
}
