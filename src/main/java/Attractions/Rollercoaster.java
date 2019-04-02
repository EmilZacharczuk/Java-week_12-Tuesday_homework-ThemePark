package Attractions;

import Visitors.Visitor;
import interfaces.ISecurity;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name,rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
        return true;}else{
            return false;
            }
    }

    public int getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }
}
