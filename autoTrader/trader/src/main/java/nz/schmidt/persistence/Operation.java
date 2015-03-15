package nz.schmidt.persistence;

import java.util.List;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Operation 
{
	
	public static void main(String[] args) 
	{
		//Persist Person entity
		 Person person = new Person();

		 person.setPersonId("1");
		 person.setPersonName("John Smith");
		 person.setPersonalData(new PersonalData("www.johnsmith.com", "john.smith@gmail.com", "jsmith"));

		 Address address = new Address();
		 address.setAddressId("111");
		 address.setStreet("123, New street");
		 person.setAddress(address);

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("CassandraPU");

		 EntityManager em = emf.createEntityManager();

		 em.persist(person);

		 //Find Person Entity
		 Person p = em.find(Person.class, "1");

		 //Run JPA Query
		 Query q = em.createQuery("select p from Person p");
		 
		 List<?> persons = q.getResultList();

		 em.close();
		 emf.close();
		}
	}
