package OOPS.assignment_4.movie;
/*3. Change 'Movie' class to abstract class and add additional abstract methods in 'Movie' class and define them in the child classes*/

public abstract class Movie {
    String movieName;
    String genre;
    float ratings;

    public Movie(String movieName, String genre, float ratings) {
        this.movieName = movieName;
        this.genre = genre;
        this.ratings = ratings;
    }

    public abstract void display();

}


