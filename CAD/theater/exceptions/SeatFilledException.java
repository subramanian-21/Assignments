package CAD.theater.exceptions;

public class SeatFilledException extends Exception{
    public SeatFilledException(String seatNumber){
        super("Seat Booked Already : "+seatNumber);
    }
}
