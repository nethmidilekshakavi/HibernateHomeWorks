package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    private int no;
    private String name;
    private String marks;


    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;

    public Student(int no, String name, String marks, String address, List<Laptop> laptop) {
        this.no = no;
        this.name = name;
        this.marks = marks;
        this.laptop = laptop;
    }

    public Student() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
}
