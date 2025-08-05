package day.six.assignment.travel.user;

import day.six.assignment.travel.booking.Ticket;

public class User {

    private String name;
    private String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void bookTicket(String ticketId, String destination, double fare) {
        System.out.println("Booking ticket for user: " + name + " (" + email + ")");
        Ticket ticket = new Ticket(ticketId, destination, fare);

        System.out.println("Ticket Booked Successfully!");
        System.out.println("Ticket Details:");
        ticket.displayTicketInfo();
    }

}

class TickMain{
    public static void main(String[] args) {
        User user = new User("Vishnu", "vishnu@example.com");
        user.bookTicket("TCK123", "Goa", 2500.0);
    }
}