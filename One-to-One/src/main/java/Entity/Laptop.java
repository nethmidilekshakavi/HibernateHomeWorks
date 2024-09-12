package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

    @Id
    private int id;
    private String lname;

    @OneToOne
    private Student student;

    public Laptop(int id, String lname, Student student) {
        this.id = id;
        this.lname = lname;
        this.student = student;
    }

    public Laptop() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLname() {
        return lname;
    }

    public Student getStudent() {
        return student;
    }
}
