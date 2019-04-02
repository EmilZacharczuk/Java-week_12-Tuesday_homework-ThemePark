package Stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }
    public int getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }
}
