package org.example;

import Entity.Student;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
        }*/



       /* Query query =  session.createQuery("from Student where no = 1");
        List<Student> studentslist = query.list();
        for (Student student : studentslist){
            System.out.println(student.getNo());
        }*/

      /*  Query query1 =  session.createQuery("from Student where no = (?,?)");
        query1.setParameter(1,2);
        List<Student> studentslist2 = query1.list();
        for (Student student : studentslist2){
            System.out.println(student.getName());
        }*/


        Query query = session.createQuery("UPDATE Student s SET s.name = :newname WHERE id = ?");
        query.setParameter("newname",1);


        query.setParameter("newname", "kavindi");
        query.setParameter("id", 1);

        int result = query.executeUpdate();

        System.out.println(result);

        transaction.commit();
        session.close();


    }
}