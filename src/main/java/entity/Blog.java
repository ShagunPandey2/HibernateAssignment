package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	private int blogid;
	private String title;
	private int ownerid;
	@OneToMany
	private List<BlogPost> blogpost;  
	
	public List<BlogPost> getBlogpost() {
		return blogpost;
	}
	public void setBlogpost(List<BlogPost> blogpost) {
		this.blogpost = blogpost;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Blog [blogid=" + blogid + ", title=" + title + ", ownerid=" + ownerid + ", blogpost=" + blogpost + "]";
	}
	
	

}
