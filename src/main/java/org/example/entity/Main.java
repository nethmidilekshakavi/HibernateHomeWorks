package org.example.entity;

import org.example.entity.Entity.Student;
import org.example.entity.Entity.Teacher;
import org.example.entity.config.FactoryConfiguration;
import org.hibernate.Session;

import org.hibernate.Transaction;

import java.util.List;


public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();


        Student student = new Student();
       /* student.setId(2);
        student.setName("pawani");
        student.setPhone(0771013456);

        session.save(student);*/

        /*student.setId(1);
        student.setName("kamala");
        session.update(student);*/

      /*  student.setId(1);
        session.delete(student);*/


        /*----------------------------------------------------------------------------------*/

        Teacher teacher = new Teacher();

/*
        teacher.setId(1);
        teacher.setName("Kamala");
        teacher.setAddress("Panadura");
*/

       /* session.save(teacher);*/

      /*  session.update(teacher);*/


        List<Teacher> t = session.createQuery("from teach",Teacher.class).getResultList();
        for (Teacher teacher1 : t){
            System.out.println("teacher ID :- " + teacher1.getId());
            System.out.println("---------------------------------------");
            System.out.println("teacher NAME :- " + teacher1.getName());
            System.out.println("---------------------------------------");
            System.out.println("teacher ADDRESS :- " + teacher1.getAddress());
        }

        System.out.println();


        transaction.commit();
        session.close();



    }
}