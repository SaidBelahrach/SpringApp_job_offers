package Models;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne; 

@Entity 
public class Discussion {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idDiscu; 
   @OneToOne
		private User user1;
   @OneToOne
   		private User user2;
   public Discussion() { }
   
}