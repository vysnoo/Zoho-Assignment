package day.seven.assignment;


interface Ticket{
     void bookTicket();
}

class BusTicket implements Ticket{

    String name ;
    String source;
    String destination;

    BusTicket(String name,String source,String destination){
        this.name=name;
        this.source=source;
        this.destination=destination;
    }

    public void bookTicket(){
        System.out.println("Bus Ticket Booked Successfully for "+this.name+"\nSource : "+this.source+"\nDestination : "+this.destination);
    }
}

class TrainTicket implements Ticket{

    String name ;
    String source;
    String destination;

    TrainTicket(String name,String source,String destination){
        this.name=name;
        this.source=source;
        this.destination=destination;
    }

    public void bookTicket(){
        System.out.println("Train Ticket Booked Successfully for "+this.name+"\nSource : "+this.source+"\nDestination : "+this.destination);
    }
}

class FlightTicket implements Ticket{

    String name ;
    String source;
    String destination;

    FlightTicket(String name,String source,String destination){
        this.name=name;
        this.source=source;
        this.destination=destination;
    }

    public void bookTicket(){
        System.out.println("Flight Ticket Booked Successfully for "+this.name+"\nSource : "+this.source+"\nDestination : "+this.destination);
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket bus = new BusTicket("Vishnu","Surandai","Salem");
        Ticket train = new TrainTicket("Amir","Attur","Ariyapalayam");
        Ticket flight = new FlightTicket("Swetha","London","India");

        bus.bookTicket();
        System.out.println("---------------------------------------");
        train.bookTicket();
        System.out.println("---------------------------------------");
        flight.bookTicket();
        System.out.println("---------------------------------------");
    }
}
