package assignment_5;
class MainClass{
    public static void main(String[] args) {
        Movie movie = new Movie("sample movie", "none", 4.3f);
        movie.getGenre();
        RomComMovie romCom = new RomComMovie("sample", "none", 4.5f);

        romCom.getGenre();

        Movie th = new ThrillerMovie("sample1", "this is sample1", 4.8f);

        th.getGenre();
    }
}
class Movie {
    private String name;
    private String story;
    private float review;
    void getGenre(){
        System.out.println("movie");
    }
    void getDetails(){
        System.out.println(name+" story:"+story+" review:"+review);
    }
    Movie(String name,String story,float review){
        this.name = name;
        this.story = story;
        this.review = review;
    }
}
class RomComMovie extends Movie{

    public RomComMovie(String name,String story,float review) {
        super(name,story, review);
    }
    @Override
    void getGenre(){
        System.out.println("RomComMovie");
    }
    
}
class ThrillerMovie extends  Movie{
    public ThrillerMovie(String name,String story,float review) {
        super(name,story, review);
    }
    @Override
    void getGenre(){
        System.out.println("ThrillerMovie");
    }
    
}