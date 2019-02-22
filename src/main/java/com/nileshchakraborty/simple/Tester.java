package com.nileshchakraborty.simple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.nileshchakraborty.simple.entity.Employee;

public class Tester {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//INSERT
		/*Employee employee = new Employee();
		employee.setFname("mgkad");
		employee.setLname("nas");
		employee.setEmail("kgas@dfa.com");
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();*/
		
		//FindByID
		/*Employee employee = entityManager.find(Employee.class, "9a6c82d3-410a-42ce-8f3a-457f06c05077");
		System.out.println(employee);*/
		//Update
		/*Employee employee = entityManager.find(Employee.class, "9a6c82d3-410a-42ce-8f3a-457f06c05077");
		System.out.println(employee);
		employee.setFname("sagsd");
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
		*/
		//Delete
		/*Employee employee = entityManager.find(Employee.class, "9a6c82d3-410a-42ce-8f3a-457f06c05077");
		System.out.println(employee);
		
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();*/
		
		//FindAll
		/*TypedQuery<Employee> que = entityManager.createQuery("select emp from Employee emp order by emp.email desc",Employee.class);
		List<Employee> list = que.getResultList();
		list.forEach(it -> System.out.println(it));*/

		/*Query q = entityManager.createNativeQuery("select * from employee;", Employee.class);
		List<Employee> list = q.getResultList();
		list.forEach(i -> System.out.println(i));*/
		
		//FINDBYEMAIL
		TypedQuery<Employee> emp = entityManager.createNamedQuery("Employee.findByEmail",Employee.class);
				
				//createQuery("select emp from Employee emp where emp.email=:paramEmail", Employee.class);
		emp.setParameter("paramEmail", "kgas@dfa.com");
		List<Employee> list = emp.getResultList();
		list.forEach(i -> System.out.println(i));
		entityManager.close();
		entityManagerFactory.close();
	}
}
