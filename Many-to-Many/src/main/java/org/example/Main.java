package org.example;

import Entity.Boy;
import Entity.Course;
import Entity.Phone;
import Entity.Student;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Student student = new Student();
        student.setSid(1);
        student.setName("Nuwan");
        student.setAddress("Matara");

        List<Student> slist = new ArrayList<>();
        slist.add(student);

        Course course = new Course();
        course.setCid(2);
        course.setName("GDSE");

        List<Course> clist = new ArrayList<>();
        clist.add(course);

        student.setCourses(clist);
        course.setStudents(slist);

        session.save(student);
        session.save(course);

       /* Phone phone = new Phone();
        phone.setPid(1);
        phone.setBrand("Apple");

        List<Phone>phones= new ArrayList<>();
        phones.add(phone);

        Boy boy = new Boy();
        boy.setBid(2);
        boy.setName("Malan");
        boy.setAddress("Kalutara");

        List<Boy>boys= new ArrayList<>();
        boys.add(boy);

        phone.setBoys(boys);
        boy.setPhones(phones);

        session.save(boy);
        session.save(phone);
*/
        transaction.commit();
        session.close();


    }
}