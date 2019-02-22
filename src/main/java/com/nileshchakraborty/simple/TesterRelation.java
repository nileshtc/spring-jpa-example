package com.nileshchakraborty.simple;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nileshchakraborty.simple.entity.Address;
import com.nileshchakraborty.simple.entity.User;

public class TesterRelation {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Insert
		/*
		User user = new User();
		user.setFname("afas");
		user.setLname("hsDD");
		user.setEmail("iga@ga.com");
		Address address = new Address();
		address.setStreet("ygsd");
		address.setCity("hasd");
		address.setState("fs");
		//user.setAddress(address);
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(address);
		user.setAddress(address);
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		*/
		//Find
		/*
		User user = entityManager.find(User.class, "a026118d-0b76-4dd5-8fc9-e32872c6b2d9");
		System.out.println(user);
		*/
		
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
