package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert_the_data_intothe_table 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
	createtable ct = new createtable();
	ct.setUserid(4);
	ct.setUsername("sathmjmjish");
	ct.setUseremail("sathis1@gmail.com");
	
	createtable ct1 = new createtable();
	ct1.setUserid(2);
	ct1.setUsername("raju");
	ct1.setUseremail("raju@gmail.com");
	
	createtable ct2 = new createtable();
	ct2.setUserid(3);
	ct2.setUsername("kaif");
	ct2.setUseremail("kaif@gmail.com");
	
	et.begin();
	em.persist(ct);
	em.persist(ct1);
	em.persist(ct2);
	et.commit();
	
	System.out.println("values are inserted");
		
	}

}
