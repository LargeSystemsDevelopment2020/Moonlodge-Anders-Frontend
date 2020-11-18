package moonlodge.frontend.moonlodgefrontend.contract.entitys;

import java.sql.Date;
import java.util.List;

public class RoomBooking {
    private long id;
    private Date dateofArrival, dateOfDeparture;
    private Room room;
    private Booking booking;

    public RoomBooking(Date dateofArrival, Date dateOfDeparture, Room room, Booking booking) {
        this.dateofArrival = dateofArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.room = room;
        this.booking = booking;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateofArrival() {
        return dateofArrival;
    }

    public void setDateofArrival(Date dateofArrival) {
        this.dateofArrival = dateofArrival;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
