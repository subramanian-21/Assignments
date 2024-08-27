
package CAD.theater;
import CAD.theater.exceptions.InvalidSeatException;
import CAD.theater.exceptions.SeatFilledException;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private int id;
    public String name;
    public Movie movie;
    private Seat[][] seats;
    public Screen(int id, int seatRows, int seatCols) {
        this.id = id-1;
        movie = null;
        seats = new Seat[seatRows][seatCols];
        name = "Screen"+id;
        for(int i = 0;i<seatRows;i++){
            for (int j = 0; j < seatCols; j++) {
                String seatNo = ""+(char)('A'+i)+""+j;
                if(i > 2){
                    seats[i][j] = new Seat("Premium", seatNo, 150 );
                }else {
                    seats[i][j] = new Seat("Budget", seatNo, 100 );
                }
            }
        }
    }
    void setMovie(Movie movie){
        this.movie = movie;
    }
    public int getSeatPrice(String id){
        int row = (id.charAt(0) - 'A');
        int col = Integer.parseInt(id.substring(1));

       return seats[row][col].getPrice();
    }
    public void buySeat(User user, String... ids) throws SeatFilledException {
        try {
            for(String id : ids){
                if(id.length() < 2){
                    throw  new InvalidSeatException(id);
                }
                int row = (id.charAt(0) - 'A');
                int col = Integer.parseInt(id.substring(1));
                if(row < 0 || row >= seats.length || col < 0 || col >= seats[0].length ){
                    throw  new InvalidSeatException(id);
                }
                if(!seats[row][col].isFilled()){
                    seats[row][col].buyTicket(user);
                }else {
                    throw new SeatFilledException(id);
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Screen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movie=" + movie.toString() +
                '}';
    }

    public void seatAvailablity(){
        System.out.println(name);
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                String seatNo = ""+(char)('A'+i)+""+j;
                if(!seats[i][j].isFilled()){
                    System.out.print(seatNo +" ");
                }else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }

    }
}
