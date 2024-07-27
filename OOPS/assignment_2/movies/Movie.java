package OOPS.assignment_2.movies;

import java.util.HashMap;
import java.util.Map;

// 4. Create a Movie DTO class
public class Movie {
    private String movieName;
    private String description;
    private double review;
    private int reviewCount;
    private  Map<String ,String> casts;

    Movie(String movieName, String description){
        this.movieName = movieName;
        this.description = description;
        this.review = 0;
        this.reviewCount = 0;
    }
    Movie(String movieName, String description, Map<String,String> casts){
        this.movieName = movieName;
        this.description = description;
        this.review = 0;
        this.casts = casts;
        this.reviewCount = 0;
    }


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCasts(Map<String, String> casts) {
        this.casts = casts;
    }

    public void setReview(float review) {
        review%=5;
        double total = reviewCount*this.review+review;
        reviewCount++;
        this.review = total/reviewCount;
    }

    @Override
    public String toString() {
        if(this.casts == null){
            return "name : "+movieName+"\ndescription : "+description+"\nreview : "+review+"\n";
        }
        return "name : "+movieName+"\ndescription : "+description+"\nreview : "+review+"\n"+getCast();
    }

    public  String getMovieName() {
        return movieName;
    }

    public  String getDescription() {
        return description;
    }

    public  double getReview() {
        return review;
    }

    public String getCast() {
        String out = "";
        for(Map.Entry<String,String> cast : casts.entrySet()){
            out += cast.getKey()+" : "+cast.getValue() +"\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Movie ragingBull = new Movie("Raging Bull","This is a movie description of raging bull");
        Map<String,String> casts = new HashMap<>();
        casts.put("hero","Robert deniro");
        casts.put("supporting","joe pesci");
        ragingBull.setCasts(casts);
        ragingBull.setReview(5);
        ragingBull.setReview(4);
        ragingBull.setReview(3);
        ragingBull.setReview(1);

        System.out.println(ragingBull.toString());
    }
}
