package org.booking.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String source;
    private String UserId;
    private String destination;
    private String dateOfTravel;
    private Train train;

    public Ticket(String ticketId, String UserId, String source, String destination, String dateOfTravel, Train train ){
        this.ticketId = ticketId;
        this.UserId = UserId;
        this.source = source;
        this.dateOfTravel = dateOfTravel;
        this.destination = destination;
        this.train =  train;
    }
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
