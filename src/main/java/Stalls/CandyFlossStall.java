package Stalls;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot,rating);
    }
    public int getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }

}
