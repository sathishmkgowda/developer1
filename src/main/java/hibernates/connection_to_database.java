package hibernates;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class connection_to_database
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  //dev means persistance unit name
		
	
		System.out.println("connection is established brother");
		
		
		
	}

}
