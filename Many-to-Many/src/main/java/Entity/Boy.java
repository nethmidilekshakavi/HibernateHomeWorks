package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Boy {
    @Id
    private int bid;

    private String name;

    private String address;

    @ManyToMany
   private List<Phone>phones;

    public Boy() {
    }

    public Boy(int bid, String name, String address, List<Phone> phones) {
        this.bid = bid;
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
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

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
