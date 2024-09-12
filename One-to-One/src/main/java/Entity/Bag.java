package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bag {

    @Id
    private int bid;

    private String colour;

    @OneToOne
    private Girl girl;

    public Bag(int bid, String colour, Girl girl) {
        this.bid = bid;
        this.colour = colour;
        this.girl = girl;
    }

    public Bag() {
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

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
