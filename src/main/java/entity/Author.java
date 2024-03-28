package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	
	private int authorid;
	private String authorname;
	@OneToOne
	private BlogPost blogpost;
	
	public BlogPost getBlogpost() {
		return blogpost;
	}
	public void setBlogpost(BlogPost blogpost) {
		this.blogpost = blogpost;
	}

	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + ", blogpost=" + blogpost + "]";
	}
	
	

}
