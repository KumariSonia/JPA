package com.sonia.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Customer cutomer = new Customer();
		cutomer.setCustomerID(100);
		cutomer.setCustomerName("Milan Bamaniya");
		cutomer.setContactName("Milan");
		cutomer.setAddress("Ahmedabad");
		cutomer.setCity("Ahmedabad");
		cutomer.setPostalCode("123456");
		cutomer.setCountry("India");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		/*
		 * Saving Data
		 */
		em.getTransaction().begin();
		em.persist(cutomer);
		em.getTransaction().commit();
		/*
		 * Fetching Value using jpa
		 */
//        Customer customer = em.find(Customer.class, 55);
//        System.out.println(customer);
	}
}
