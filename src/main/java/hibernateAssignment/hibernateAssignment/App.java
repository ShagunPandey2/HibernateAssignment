package hibernateAssignment.hibernateAssignment;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Author;
import entity.Blog;
import entity.BlogPost;
import entity.UserAccount;
import entity.UserProfile;
//import hibernateAssignment.hibernateAssignment.HibernateUtlis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UserProfile prof1=new UserProfile();
        prof1.setName("Shagun");
        

        SessionFactory sessionFactory = HibernateUtlis.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(prof1);

        
        UserAccount user1=new UserAccount();
        user1.setUsername("Shagun Pandey");
        user1.setPassword("ABC");
        
        UserAccount user2=new UserAccount();
        user2.setUsername("Simran");
        user2.setPassword("XYZ");
        
       user1.setUserr(prof1);
        session.persist(user1);
        session.persist(user2);
        
        
	    //session.getTransaction().commit();

        
        
     session.createQuery("from UserAccount", UserAccount.class).list().forEach(System.out::println);
   
     BlogPost b1=new BlogPost();
     b1.setPost("ABC");
     
     BlogPost b2=new BlogPost();
     b2.setPost("XYZ");
     
     session.persist(b2);
     session.persist(b1);
     
    ArrayList<BlogPost> list1=new ArrayList<BlogPost>();    
    list1.add(b1);    
    list1.add(b2);    
    
   Blog blog=new Blog();
   blog.setTitle("JAVA");
   
   blog.setBlogpost(list1);
   session.persist(blog); 
   
   
   
//   
//   Blog blog1=new Blog();
//   blog1.setTitle(".Net");
//   
   
   Author a1=new Author();
   a1.setAuthorname("Pratibha");
   
   a1.setBlogpost(b1);
   a1.setBlogpost(b2);
   
//   
   session.persist(a1);
//     
   session.createQuery("from Blog", Blog.class).list().forEach(System.out::println);
   session.createQuery("from Author", Author.class).list().forEach(System.out::println);
//   
//   
   ArrayList<UserAccount> ansuser=new ArrayList<UserAccount>();    
   ansuser.add(user1);
   ansuser.add(user2);
//   
//   
  user1.setBlogg(list1);
  b1.setUserlist(ansuser);
  
  session.persist(user1);
  session.persist(b1);
  
  session.getTransaction().commit();
     session.createQuery("from UserAccount", UserAccount.class).list().forEach(System.out::println);
     
    
//     
     session.close();
     
    }
}