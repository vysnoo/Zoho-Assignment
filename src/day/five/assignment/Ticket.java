package day.five.assignment;

public abstract class Ticket {
    protected String passengerName;
    protected String destination;

    public Ticket(String passengerName,String destination){
        this.passengerName=passengerName;
        this.destination=destination;
    }
    public abstract void bookTicket();
}

class BusTicket extends Ticket{
    BusTicket(String passengerName,String destination){
        super(passengerName, destination);
    }
    @Override
    public void bookTicket() {
        System.out.println("Booking Bus Ticket for " + passengerName + " to " + destination);
        System.out.println("Bus Ticket Booked Successfully!\n");
    }

}

class TrainTicket extends Ticket{
    public TrainTicket(String passengerName, String destination) {
        super(passengerName, destination);
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking Train Ticket for " + passengerName + " to " + destination);
        System.out.println("Train Ticket Booked with PNR Number!\n");
    }
}

class FlightTicket extends Ticket{
    public FlightTicket(String passengerName, String destination) {
        super(passengerName, destination);
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking Flight Ticket for " + passengerName + " to " + destination);
        System.out.println("Flight Ticket Booked with E-Ticket Confirmation!\n");
    }
}

class TicketBookingSystem{
    public static void main(String[] args) {

        // Polymorphic references
        Ticket t1 = new BusTicket("Alice", "Chennai");
        Ticket t2 = new TrainTicket("Bob", "Mumbai");
        Ticket t3 = new FlightTicket("Charlie", "Delhi");

        t1.bookTicket();
        t2.bookTicket();
        t3.bookTicket();

    }
}