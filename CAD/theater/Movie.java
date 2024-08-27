package CAD.theater;

public class Movie {
    private String name;
    private float rating;
    private boolean is3d;

    public Movie(String name, float rating,boolean is3d ){
        this.name = name;
        this.rating = rating;
        this.is3d = is3d;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", is3d=" + is3d +
                '}';
    }
}
