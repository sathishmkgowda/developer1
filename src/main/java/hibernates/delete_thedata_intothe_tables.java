package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete_thedata_intothe_tables 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		createtable ct = em.find(createtable.class, 4);
		
		et.begin();
		em.remove(ct);
		et.commit();
		
		System.out.println("sucessfully deleted");
		
	}

}
