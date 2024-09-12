package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    private int no;
    private String name;
    private String marks;


    public Student(int no, String name, String marks) {
        this.no = no;
        this.name = name;
        this.marks = marks;

    }

    public Student() {
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getMarks() {
        return marks;
    }
}
