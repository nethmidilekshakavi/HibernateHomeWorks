package org.example;

import Entity.Employee;
import Entity.Laptop;
import Entity.Student;
import Entity.Vehicle;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        /*Laptop laptop = new Laptop();
        laptop.setId(03);
        laptop.setLname("HP");

        List<Laptop> list = new ArrayList<>();
        list.add(laptop);

        Student student = new Student();

        student.setNo(02);
        student.setName("Nimala");
        student.setMarks("60");
        student.setLaptop(list);


        laptop.setStudent(student);

        session.save(laptop);
        session.save(student);*/


        Vehicle vehicle = new Vehicle();
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




    }
}