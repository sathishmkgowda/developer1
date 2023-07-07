package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update_specificcell_values_inthe_table {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		createtable up = em.find(createtable.class, 1);
		
		
		up.setUseremail("kaif");
		
		et.begin();
		em.persist(up);
		et.commit();
		
		System.out.println("sucessfully updated");

		// TODO Auto-generated method stub

	}

}
