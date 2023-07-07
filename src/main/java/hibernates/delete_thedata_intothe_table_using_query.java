package hibernates;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class delete_thedata_intothe_table_using_query
{
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Query query = em.createQuery("delete from hithu where userid=2"); //to remove complete table remove where clause in querry
	
	et.begin();
	query.executeUpdate();
	et.commit();
	System.out.println("the value is deleted");
	}

}
