package org.example;


import Entity.Student;
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

                //SELECT

                Query query = session.createQuery("select s from Student s");
                List<Student> studentList = query.getResultList();

                for (Student student : studentList){
                    System.out.println(student);
                }





                //UPDATE

        Query query1 = session.createQuery("update Student  s set s.name = :address, s.name = :name  where s.sId = :Id");
        query1.setParameter("address","Galle");
        query1.setParameter("name","Dilmi");
        query1.setParameter("Id",2);
        query1.executeUpdate();


                //DELETE

        /*Query query2 = session.createQuery("delete from Student s where s.sId = :Id");
        query2.setParameter("Id",2);
        query2.executeUpdate();*/


                //SEARCH BY ID

        /*Query query3 = session.createQuery("select s from Student s where s.sId = :Id");
        query3.setParameter("Id",3);
        List<Student> stList = query3.list();

        for (Student student : stList){
            System.out.println(student);
        }*/


                //JOINQUERY

        /*Query query4 = session.createQuery("select w from Student s join s.watchList w where s.sId = :Id");
        query4.setParameter("Id",1);
        List<Watch> watches = query4.list();

        for (Watch watch : watches){
            System.out.println("Watch type :"+watch.getType());
        }*/

                transaction.commit();
                session.close();
}
        }






