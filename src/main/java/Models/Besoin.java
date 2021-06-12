package Models;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity 
public class Besoin {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idCateg;
   private String nomCateg;
   private String DescriCateg; 
   public Besoin() { }
public int getIdCateg() {
	return idCateg;
}
public void setIdCateg(int idCateg) {
	this.idCateg = idCateg;
}
public String getNomCateg() {
	return nomCateg;
}
public void setNomCateg(String nomCateg) {
	this.nomCateg = nomCateg;
}
public String getDescriCateg() {
	return DescriCateg;
}
public void setDescriCateg(String descriCateg) {
	DescriCateg = descriCateg;
}
public Besoin(int idCateg, String nomCateg, String descriCateg) {
	super();
	this.idCateg = idCateg;
	this.nomCateg = nomCateg;
	DescriCateg = descriCateg;
}
@Override
public String toString() {
	return "Besoin [idCateg=" + idCateg + ", nomCateg=" + nomCateg + ", DescriCateg=" + DescriCateg + "]";
}
   
}