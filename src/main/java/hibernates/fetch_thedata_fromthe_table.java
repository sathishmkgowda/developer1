package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch_thedata_fromthe_table 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		createtable up = em.find(createtable.class, 1);
		
		System.out.println("userid :"+up.getUserid()+"    "+"username :"+up.getUsername()+"    "+"useremail :"+up.getUseremail());

	}

}
