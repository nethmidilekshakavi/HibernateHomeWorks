package org.example;

import Entity.Student;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Student student = session.get(Student.class,2);

        System.out.println(student.getNo());


        transaction.commit();
        session.close();


    }
}