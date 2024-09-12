package org.example;

import Entity.*;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /*Student student = new Student();
        student.setNo(1);
        student.setName("Mala");
        student.setMarks("80");

        Laptop laptop = new Laptop();
        laptop.setId(01);
        laptop.setLname("HP");
        laptop.setStudent(student);


        session.save(student);
        session.save(laptop);
*/

        /*Vehicle vehicle = new Vehicle();
        vehicle.setVid(1);
        vehicle.setName("Van");

        Employee employee= new Employee();
        employee.setEid(2);
        employee.setName("Kumara");
        employee.setAddress("Galle");

        employee.setVehicle(vehicle);

        session.save(employee);
        session.save(vehicle);*/

        Girl girl = new Girl();
        girl.setId(1);
        girl.setName("Dileksha");
        girl.setAddress("Panadura");

        Girl girl1 = new Girl();
        girl1.setId(2);
        girl1.setName("Tharaka");
        girl1.setAddress("Galle");


        Bag bag = new Bag();
        bag.setBid(1);
        bag.setColour("Black");
        bag.setGirl(girl);

        Bag bag1 = new Bag();
        bag1.setBid(2);
        bag1.setColour("Blue");
        bag1.setGirl(girl1);


        session.save(girl);
        session.save(girl1);

        session.save(bag);
        session.save(bag1);


        transaction.commit();
        session.close();

    }
}