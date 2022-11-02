package modulo15.model.entities;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        Duration duration = Duration.between(getCheckIn().toInstant(), getCheckOut().toInstant());
        return duration.toDays();
    }

    public void updateDates(Date checkin, Date checkout){
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Reservation: Room ");
        sb.append(getRoomNumber());
        sb.append(", check-in: ");
        sb.append(sdf.format(getCheckIn()));
        sb.append(", check-out: ");
        sb.append(sdf.format(getCheckOut()));
        sb.append(", " + duration() + " nights");
        return sb.toString();
    }
}
