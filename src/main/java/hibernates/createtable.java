package hibernates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="hithu")

public class createtable 
{
	@Id
	private int userid;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false,unique = true)
	private String useremail;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
		
		

		
	

}
