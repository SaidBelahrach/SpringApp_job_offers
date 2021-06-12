package Models;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne; 

@Entity 
public class Message {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idMsg;
   private String msg;
   private Date date; 
   private Boolean isread;
   private String type;//txt or img  
   private String img;
	@ManyToOne   
  	private Discussion discussion;
   public Message() { }

}