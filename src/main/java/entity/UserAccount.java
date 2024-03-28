package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class UserAccount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
	private int userId;
    private String username;
    private String password;
    
    @ManyToMany(mappedBy="userlist")
    private List<BlogPost> blogg;
    
	
	public List<BlogPost> getBlogg() {
		return blogg;
	}
	public void setBlogg(List<BlogPost> blogg) {
		this.blogg = blogg;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    @OneToOne
    private UserProfile userr;
	public UserProfile getUserr() {
		return userr;
	}
	public void setUserr(UserProfile userr) {
		this.userr = userr;
	}
	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", username=" + username + ", password=" + password + ", blogg="
				+ blogg + ", userr=" + userr + "]";
	}
	
	
	
	
//	
//	@ManyToMany(mappedBy="ans")
//	ArrayList<BlogPost> ansuser=new ArrayList<BlogPost>();  
//	
//	public ArrayList<BlogPost> getAnsuser() {
//		return ansuser;
//	}
//	public void setAnsuser(ArrayList<BlogPost> ansuser) {
//		this.ansuser = ansuser;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "UserAccount [userId=" + userId + ", username=" + username + ", password=" + password + ", userr="
//				+ userr + ", ansuser=" + ansuser + "]";
//	}
//	
//	
	
    
   
    
}
