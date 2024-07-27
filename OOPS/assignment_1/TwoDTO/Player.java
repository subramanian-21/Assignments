package OOPS.assignment_1.TwoDTO;

public class Player {
    private String name ;
    private String position;
    private int jerseyNumber;
    Player(String name,String position, int jerseyNumber){
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void playGame(){
        System.out.println("player "+name+" is Playing a match...");
    }
    public void train(){
        System.out.println("player "+name+" is Training...");
    }
}
