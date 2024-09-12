package org.example.entity.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "stud")
public class Student {

    @Id
    private int id;
    private String name;
    private int phone;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
