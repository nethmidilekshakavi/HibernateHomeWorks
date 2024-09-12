package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicle {
@Id
    private int vid;
    private String name;

    @ManyToOne
    private Employee employee;

    public Vehicle(int vid, String name, Employee employee) {
        this.vid = vid;
        this.name = name;
        this.employee = employee;
    }

    public Vehicle() {
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
