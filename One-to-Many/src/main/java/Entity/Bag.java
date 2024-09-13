package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Bag {

    @Id
    private int bid;

    private String colour;


    @ManyToOne
    private Boy boy;

    public Bag() {
    }

    public Bag(int bid, String colour, Boy boy) {
        this.bid = bid;
        this.colour = colour;
        this.boy = boy;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }
}
