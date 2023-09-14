package org.hbm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hbm.Entity.Employee;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("amirza");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee e=new Employee("ali","hamidi","0078061210");
        entityManager.persist(e);

        entityManager.getTransaction().commit();
        entityManager.close();


    }

}
