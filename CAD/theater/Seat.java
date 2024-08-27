package CAD.theater;

public class Seat {
    private String type;
    private String id;
    private int price;
    private User bookedUser;

    Seat(String type, String id, int price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }
    public void buyTicket(User user){
        bookedUser = user;
    }
    public boolean isFilled(){
        return bookedUser != null;
    }
    public int getPrice(){
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
