package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postid;
	private String post;
	@ManyToOne
	private Author author;
	
	@ManyToMany
	private List<UserAccount> userlist;
	
	
	
	public List<UserAccount> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<UserAccount> userlist) {
		this.userlist = userlist;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BlogPost [postid=" + postid + ", post=" + post + ", author=" + author + "]";
	}


	
	
	

	

}
