package Models;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne; 

@Entity 
public class Reclamation {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int id;
   private String comment;
   private Date date; 
   @ManyToOne
   		public Offre offre;
   @OneToOne
   		public User reclameur;
   public Reclamation() { }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Offre getOffre() {
	return offre;
}
public void setOffre(Offre offre) {
	this.offre = offre;
}
public User getReclameur() {
	return reclameur;
}
public void setReclameur(User reclameur) {
	this.reclameur = reclameur;
}
public Reclamation(int id, String comment, Date date, Offre offre, User reclameur) {
	super();
	this.id = id;
	this.comment = comment;
	this.date = date;
	this.offre = offre;
	this.reclameur = reclameur;
}
@Override
public String toString() {
	return "Reclamation [id=" + id + ", comment=" + comment + ", date=" + date + ", offre=" + offre + ", reclameur="
			+ reclameur + "]";
}
 
   
}