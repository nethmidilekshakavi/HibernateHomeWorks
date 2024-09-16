package org.example;

import Entity.*;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Laptop laptop = new Laptop();
        laptop.setId(01);
        laptop.setLname("HP");

        List<Laptop> list = new ArrayList<>();
        list.add(laptop);

        Student student = new Student();

        student.setNo(01);
        student.setName("Pawani");
        student.setMarks("80");
        student.setLaptop(list);


        laptop.setStudent(student);

        session.save(laptop);
        session.save(student);


       /* Vehicle vehicle = new Vehicle();
        vehicle.setVid(10);
        vehicle.setName("BUS");


        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVid(20);
        vehicle1.setName("CAR");

        Employee employee = new Employee();
        employee.setEid(1);
        employee.setName("Nethu");
        employee.setAddress("Panadura");


        Employee employee1 = new Employee();
        employee1.setEid(2);
        employee1.setName("Nishan");
        employee1.setAddress("Kalutara");


        List<Vehicle> list = new ArrayList<>();
        List<Vehicle> list1 = new ArrayList<>();
        list.add(vehicle);
        list1.add(vehicle1);

        vehicle.setEmployee(employee);
        vehicle1.setEmployee(employee1);

        session.save(employee);
        session.save(vehicle);

        session.save(employee1);
        session.save(vehicle1);

        transaction.commit();
        session.close();
*/

        /*Bag bag = new Bag();
        bag.setBid(2);
        bag.setColour("Red");

        List<Bag>list = new ArrayList<>();
        list.add(bag);

        Boy boy = new Boy();
        boy.setId(1);
        boy.setName("Nimal");
        boy.setAddress("Matara");
        boy.setBag(list);

        bag.setBoy(boy);

        session.save(boy);
        session.save(bag);*/

        transaction.commit();
        session.close();


    }
}