package com.tns.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	

		public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			
			//create an employee1
			Employee emp=new Employee();
			emp.setName("Netrangi");
			em.persist(emp);
			
			
			
			//create an employee1
			Address mg=new Address();
			mg.setAddressId(1);
			mg.setCity("Nagpur");
			mg.setZipcode("0712");
			mg.setStreet("Civil Lines");
			mg.setState("MAHARASHTRA");
			emp.setAddress(mg);
			em.persist(mg);
			
			em.getTransaction().commit();
			System.out.println("Added Employees and Manager Successfully");
			em.close();
			factory.close();
			
		}

	}
