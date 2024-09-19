package org.example;

import Entity.Laptop;
import Entity.Student;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


       /* Query query =  session.createQuery("from Student");
        List<Student> studentslist = query.list();
        for (Student student : studentslist){
            System.out.println(student.getNo());
        }



        Query query =  session.createQuery("from Student where no = 1");
        List<Student> studentslist = query.list();
        for (Student student : studentslist){
            System.out.println(student.getNo());
        }

        Query query1 =  session.createQuery("from Student where no = (?,?)");
        query1.setParameter(1,2);
        List<Student> studentslist2 = query1.list();
        for (Student student : studentslist2){
            System.out.println(student.getName());
        }
*/
       /* --------------------------------------------------------------------------------*/

        /*HQL does not have direct insert query*/
/*
        NativeQuery query = session.createNativeQuery("INSERT INTO Student (no, marks, name) VALUES (:1,:2,:3)");
        query.setParameter("1", 5);
        query.setParameter("2", 20);
        query.setParameter("3", "dile");
        query.executeUpdate();*/


        /* --------------------------------------------------------------------------------*/


        /*update*/
       /* Query query = session.createQuery("UPDATE Student SET name = :name WHERE no = :no");
        query.setParameter("name","sidevi");
        query.setParameter("no",1);
        query.executeUpdate();*/



        /* --------------------------------------------------------------------------------*/
//        delete

          /*  Query query = session.createQuery("DELETE FROM Student where no =:no");
            query.setParameter("no",3);
            query.executeUpdate();*/

        /* --------------------------------------------------------------------------------*/

       /* search*/

        /*select one column*/

      /*  Query query = session.createQuery("SELECT s.no, s.name FROM Student s WHERE s.no = :no");
        query.setParameter("no", 1);
        List<Object[]> results = query.list();

        for (Object[] result : results) {
            Integer id = (Integer) result[0];
            String name = (String) result[1];

            System.out.println("Student no: " + id + ", Name: " + name);
        }*/

        /* -----------------------select all column---------------------------------------------------------*/

       /* Query query = session.createQuery("select s.no ,s.name, s.marks from Student s");
        List<Object[]> results = query.list();

        for (Object[] result : results) {
            Integer id = (Integer) result[0];
            String name = (String) result[1];
            String marks = (String) result[2];

            System.out.println("Student no: " + id + ", Name: " + name +"marks: " +marks);


        }*/

        /* --------------------------------------------------------------------------------*/


        /* join*/
       /* Query query = session.createQuery("SELECT l.id, l.lname FROM Laptop l INNER JOIN l.student s WHERE s.no = :id");
        query.setParameter("id", 1);
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer lapid = (Integer) result[0];
            String lapname = (String) result[1];
            System.out.println(lapid + " " + lapname );
        }*/

        transaction.commit();
        session.close();


    }
}