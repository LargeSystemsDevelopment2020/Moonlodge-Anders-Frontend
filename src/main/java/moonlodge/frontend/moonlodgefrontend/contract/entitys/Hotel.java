package moonlodge.frontend.moonlodgefrontend.contract.entitys;

import java.util.Collection;

public class Hotel {

    private String name, address, city;
    private double rating, distanceToCenter;
    private long id;
    private HeadQuarter headQuarter;
    private Collection<Room> rooms;


    public Hotel(String name, String address, String city, double rating, double distanceToCenter, HeadQuarter headQuarter, Collection<Room> rooms) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.rating = rating;
        this.distanceToCenter = distanceToCenter;
        this.headQuarter = headQuarter;
        this.rooms = rooms;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public HeadQuarter getHeadQuarter() {
        return headQuarter;
    }

    public void setHeadQuarter(HeadQuarter headQuarter) {
        this.headQuarter = headQuarter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(double distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
