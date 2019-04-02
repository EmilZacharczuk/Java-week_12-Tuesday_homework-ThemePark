package Attractions;

import Visitors.Visitor;
import interfaces.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
        return true;}
        else{
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