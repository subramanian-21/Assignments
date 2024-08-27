package CAD.theater.exceptions;

public class InvalidSeatException extends Exception{
    public InvalidSeatException(String seatNumber){
        super("Invalid Seat Number : "+seatNumber);
    }
}
