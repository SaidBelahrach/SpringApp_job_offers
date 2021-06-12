package Models;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany; 

@Entity 
public class HistoTravaux {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int id;
   private String description;
   private String img; 
   private Date date;
   @ManyToOne
   		public Categorie Offre; 
   
   public HistoTravaux() { }

}