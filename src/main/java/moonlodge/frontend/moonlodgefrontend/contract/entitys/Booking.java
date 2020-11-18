package moonlodge.frontend.moonlodgefrontend.contract.entitys;

import java.util.List;

public class Booking {
    private long id;
    private boolean arrivalIsLate;
    private List<RoomBooking> roomBookings;
    private List<Guest> guests;

    public Booking(boolean arrivalIsLate, List<RoomBooking> roomBookings, List<Guest> guests) {
        this.arrivalIsLate = arrivalIsLate;
        this.roomBookings = roomBookings;
        this.guests = guests;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isArrivalIsLate() {
        return arrivalIsLate;
    }

    public void setArrivalIsLate(boolean arrivalIsLate) {
        this.arrivalIsLate = arrivalIsLate;
    }

    public List<RoomBooking> getRoomBookings() {
        return roomBookings;
    }

    public void setRoomBookings(List<RoomBooking> roomBookings) {
        this.roomBookings = roomBookings;
    }
    public void addRoomBooking(RoomBooking roomBooking) {
        this.roomBookings.add(roomBooking);
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
    public void addCustomer(Guest guest) {
        this.guests.add(guest);
    }
}
