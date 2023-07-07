package hibernates;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetch_thedata_fromthe_table_using_query 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query= em.createQuery("select createtable from hithu createtable",createtable.class);
	 List<createtable>lis = query.getResultList();
	 
	 for (createtable createtable : lis)
	 {
		 System.out.println(createtable.getUserid()+"   "+createtable.getUseremail()+"  "+createtable.getUsername());
		
	}
					
		
	}

}
