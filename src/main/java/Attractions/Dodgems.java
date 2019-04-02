package Attractions;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
