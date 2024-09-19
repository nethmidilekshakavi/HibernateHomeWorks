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
        NativeQuery query = session.createNativeQuery("INSERT INTO Student (no, marks, name) VALUES (:no, :marks, :name)");
        query.setParameter("no", 3);
        query.setParameter("marks", 20);
        query.setParameter("name", "kavi");
        query.executeUpdate();

        /*update-----------------------------------------------------------------------------------*/
        /* NativeQuery query = session.createNativeQuery("UPDATE Student SET name = 'dileksha' WHERE no = :no");
         query.setParameter("no", 1);*/


       /* delete-----------------------------------------------------------------------------------*/
         /*NativeQuery query = session.createNativeQuery("DELETE FROM Student WHERE no = :no");
         query.setParameter("no", 3);*/

        /* search-----------------------------------------------------------------------------------*/
        /* NativeQuery query = session.createNativeQuery("SELECT * FROM Student WHERE name = :name", Student.class);
         query.setParameter("name", "dileksha");
         List<Student> list = query.getResultList();
         for (Student student : list) {
            System.out.println(student.getNo() + " " + student.getName() + " " + student.getMarks());
         }*/

        /*joinQuery-----------------------------------------------------------------------------------------*/
       /* Query query = session.createQuery("SELECT s.no, s.name , s.marks FROM Student s INNER JOIN Laptop l ON s.no = l.id");
        List<Object[]> results = query.list();
        for (Object[] result : results) {
            Integer studentNo = (Integer) result[0];
            String studentName = (String) result[1];
            Integer studentMarks = (Integer) result[2];
            System.out.println(studentNo + " " + studentName + " " + studentMarks);
        }
*/



        transaction.commit();
        session.close();
    }
}