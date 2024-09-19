package org.example;

import Entity.Student;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       /*  NativeQuery query =session.createNativeQuery("select * from Student");
        query.addEntity(Student.class);
        List<Student> list = query.getResultList();
        for (Student student : list){
            System.out.println(student.getNo());
        }*/

       /* insert--------------------------------------------------------------------------------------*/
       /* NativeQuery query = session.createNativeQuery("INSERT INTO Student (no, marks, name) VALUES (?1, ?2,?3)");
        query.setParameter(1, 5);
        query.setParameter(2, 20);
        query.setParameter(3, "dile");
        query.executeUpdate();*/


        /*update-----------------------------------------------------------------------------------*/
        /* NativeQuery query = session.createNativeQuery("UPDATE Student SET name = ?1 WHERE no = ?2");
         query.setParameter(1, "pawan");
         query.setParameter(2,5);
         query.executeUpdate();*/



        /* delete-----------------------------------------------------------------------------------*/
         /*NativeQuery query = session.createNativeQuery("DELETE FROM Student WHERE no = ?1");
         query.setParameter(1, 5);
         query.executeUpdate();*/


        /* search-----------------------------------------------------------------------------------*/
        /* NativeQuery query = session.createNativeQuery("SELECT * FROM Student WHERE name = ?1", Student.class);
         query.setParameter(1, "Nimala");
         List<Student> list = query.getResultList();
         for (Student student : list) {
            System.out.println(student.getNo() + " " + student.getName() + " " + student.getMarks());
         }*/



        /*joinQuery-----------------------------------------------------------------------------------------*/
       /* Query query = session.createQuery("SELECT s.no, s.name , s.marks FROM Student s INNER JOIN Laptop l ON s.no = l.id");
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