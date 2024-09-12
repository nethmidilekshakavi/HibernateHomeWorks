package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Employee {
@Id
    private int eid;
    private String name;

    private String address;

    @OneToMany(mappedBy="employee")
    private List<Vehicle> vehicle;

    public Employee(int eid, String name, String address, List<Vehicle> vehicle) {
        this.eid = eid;
        this.name = name;
        this.address = address;
        this.vehicle = vehicle;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
