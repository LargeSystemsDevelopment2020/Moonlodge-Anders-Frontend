package moonlodge.frontend.moonlodgefrontend.contract.dto;

import java.sql.Date;

public class RoomDTO {
    private Date dateofArrival, dateofDeparture;
    private long roomID;
    private String type;
    private double price;
    private int maxCapacity;

    public RoomDTO() {
    }

    public RoomDTO(Date dateofArrival, Date dateofDeparture, long id, String type, double price, int maxCapacity) {
        this.dateofArrival = dateofArrival;
        this.dateofDeparture = dateofDeparture;
        this.roomID = id;
        this.type = type;
        this.price = price;
        this.maxCapacity = maxCapacity;
    }

    public Date getDateofArrival() {
        return dateofArrival;
    }

    public void setDateofArrival(Date dateofArrival) {
        this.dateofArrival = dateofArrival;
    }

    public Date getDateofDeparture() {
        return dateofDeparture;
    }

    public void setDateofDeparture(Date dateofDeparture) {
        this.dateofDeparture = dateofDeparture;
    }

    public long getId() {
        return roomID;
    }

    public void setId(long id) {
        this.roomID = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
