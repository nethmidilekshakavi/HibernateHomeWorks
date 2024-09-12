package org.example.entity.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "teach")
public class Teacher {

    @Id
    private int id;
    private String name;
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Teacher(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Teacher() {
    }
}
