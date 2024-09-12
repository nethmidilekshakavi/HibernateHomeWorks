package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Boy {
    @Id
    private int id;

    private String name;

    private String address;

    @OneToMany(mappedBy = "boy")
    private List<Bag>bag;

    public Boy(int id, String name, String address, List<Bag> bag) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bag = bag;
    }

    public Boy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Bag> getBag() {
        return bag;
    }

    public void setBag(List<Bag> bag) {
        this.bag = bag;
    }
}
