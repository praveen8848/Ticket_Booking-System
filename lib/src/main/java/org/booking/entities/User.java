package org.booking.entities;

import java.util.List;

public class User {

    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;  // ✅ changed to camelCase
    private String user_id;              // ✅ changed to match "user_id" in JSON

    public User() {}

    public void printTickets() {
        for (int i = 0; i < ticketsBooked.size(); i++) {
            System.out.println(ticketsBooked.get(i).getTrain().getTrainInfo());
        }
    }

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String user_id) {
        this.name = name;
        this.user_id = user_id;
        this.hashedPassword = hashedPassword;
        this.password = password;
        this.ticketsBooked = ticketsBooked;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Boolean cancelBooking(String ticketId) {
        return Boolean.FALSE;
    }
}
