package Entity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class JPQLModule {

    // Insert data using JPQL (via entity persistence)
    public void insertCustomer(EntityManager entityManager, String name) {
        Student customer = new Student();
        customer.setName(name);

        entityManager.getTransaction().begin();
        entityManager.persist(customer); // Insert entity into the database
        entityManager.getTransaction().commit();
    }

    // Delete data using JPQL
    public void deleteCustomer(EntityManager entityManager, int customerId) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE FROM Student s WHERE s.no = :cid");
        query.setParameter("cid", customerId);
        int rowsDeleted = query.executeUpdate(); // Returns the number of rows affected
        entityManager.getTransaction().commit();
    }

    // Update data using JPQL
    public void updateCustomer(EntityManager entityManager, int customerId, String newName) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Student c SET c.name = :name WHERE c.no = :cid");
        query.setParameter("name", newName);
        query.setParameter("cid", customerId);
        int rowsUpdated = query.executeUpdate(); // Returns the number of rows affected
        entityManager.getTransaction().commit();
    }

    // Search customers using JPQL
    public List<Student> searchCustomerByName(EntityManager entityManager, String name) {
        Query query = entityManager.createQuery("SELECT c FROM Student c WHERE c.name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    // Join query using JPQL
    public List<Object[]> joinCustomerAddress(EntityManager entityManager) {
        Query query = entityManager.createQuery(
                "SELECT c.cid, c.name, a.no, a.name FROM Student c JOIN c.name a"
        );
        return query.getResultList();
    }
}
