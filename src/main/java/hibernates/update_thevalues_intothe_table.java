package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update_thevalues_intothe_table {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		createtable ct = new createtable();

		ct.setUserid(4);
		ct.setUseremail("sathi@gmail.com");
		ct.setUsername("rudra");

		et.begin();
		em.merge(ct);
		et.commit();
		
		System.out.println("sucessfully updated");

	}

}
