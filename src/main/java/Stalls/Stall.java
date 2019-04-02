package Stalls;

import interfaces.IReviewed;

public abstract class Stall implements IReviewed {
    protected String name;
    private String ownerName;
    private int parkingSpot;
    protected int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
