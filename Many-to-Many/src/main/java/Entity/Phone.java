package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Phone {

    @Id
    private int pid;

    private String brand;

    @ManyToMany(mappedBy = "phones")
    private List<Boy>boys;

    public Phone(int pid, String brand, List<Boy> boys) {
        this.pid = pid;
        this.brand = brand;
        this.boys = boys;
    }

    public Phone() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Boy> getBoys() {
        return boys;
    }

    public void setBoys(List<Boy> boys) {
        this.boys = boys;
    }
}
