package org.example;

import Entity.Employee;
import Entity.Laptop;
import Entity.Student;
import Entity.Vehicle;
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






        transaction.commit();
        session.close();

    }
}