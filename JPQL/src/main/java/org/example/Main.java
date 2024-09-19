package org.example;
import config.FactoryConfiguration;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {


                Session session = FactoryConfiguration.getInstance().getSession();
                Transaction transaction = session.beginTransaction();

                //SELECT------------------------------------------------

              /*  Query query = session.createQuery("select s from Student s");
                List<Student> studentList = query.getResultList();

                for (Student student : studentList){
                    System.out.println(student.getNo() + student.getName() + student.getMarks());
                }*/

                //UPDATE--------------------------------------------------------

/*
        Query query1 = session.createQuery("update Student  s set s.marks = :marks, s.name = :name  where s.no = :Id");
        query1.setParameter("marks","80");
        query1.setParameter("name","maduri");
        query1.setParameter("Id",2);
        query1.executeUpdate();
*/


                //DELETE-------------------------------------------------------

       /* Query query2 = session.createQuery("delete from Student s where s.no = :Id");
        query2.setParameter("Id",2);
        query2.executeUpdate();*/


                //SEARCH BY ID----------------------------------------------------

       /* Query query3 = session.createQuery("select s from Student s where s.no = :Id");
        query3.setParameter("Id",3);
        List<Student> stList = query3.getResultList();

        for (Student student : stList){
            System.out.println(student.getNo());
        }*/


                //JOIN QUERY-------------------------------------------------------

       /* Query query4 = session.createQuery("select l from Student s join s.laptop l where s.no = :Id");
        query4.setParameter("Id",1);
        List<Laptop> list = query4.getResultList();

        for (Laptop laptop : list){
            System.out.println("lap name :"+laptop.getLname());
        }
*/
                transaction.commit();
                session.close();
}
        }






