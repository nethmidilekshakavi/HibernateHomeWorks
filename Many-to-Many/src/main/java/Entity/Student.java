package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Student {
@Id
    private int sid;
    private String name;
    private String address;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student(int sid, String name, String address, List<Course> courses) {
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    public Student() {
    }
}
