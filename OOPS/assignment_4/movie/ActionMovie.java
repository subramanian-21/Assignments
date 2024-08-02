package OOPS.assignment_4.movie;

class ActionMovie extends Movie {
    public ActionMovie(String movieName, String genre, float ratings) {
        super(movieName, genre, ratings);
    }


    public void display() {
        System.out.println("Action Movie");
        System.out.println("MovieName: " + this.movieName + "\nGenre: " + this.genre + "\nRatings :" + this.ratings);
    }
}
