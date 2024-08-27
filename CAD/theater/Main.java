package CAD.theater;

import CAD.theater.exceptions.SeatFilledException;

public class Main {
    public static void main(String[] args) throws SeatFilledException {
        User sub = new User("Subramanian", "9952909151");

        BookingApplication ba = new BookingApplication();
        ba.printTheaters();

        ba.getTheaterById(1).getScreen("Screen1").seatAvailablity();

        ba.getTheaterById(1).getScreen("Screen1").buySeat(sub, "A7", "A6", "A5", "A4", "A3");
        ba.getTheaterById(1).getScreen("Screen1").buySeat(sub, "A7");
        ba.getTheaterById(1).getScreen("Screen1").buySeat(sub, "X7", "B0", "B2");

        ba.getTheaterById(2).printScreens();

        ba.getTheaterById(1).getScreen("Screen1").buySeat(sub, "B7", "B0", "B2");

        ba.getTheaterById(1).getScreen("Screen1").seatAvailablity();
    }
}
