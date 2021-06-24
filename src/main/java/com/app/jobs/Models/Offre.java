package com.app.jobs.Models;
 

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
  
@Entity(name = "Offre") 
public class Offre {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idService;
   private String nom;
   private Float prix; 
   private String descri; 
   private String[] imgs;
   
   @OneToMany(mappedBy = "offre", fetch = FetchType.LAZY,  //nom de attr de rela
           cascade = CascadeType.ALL)
   private List<HistoTravaux> mes_travaux;
   
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "categorie_id", nullable = false)
   private Categorie categorie;
   
   
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "user_id", nullable = false) //fk column name
   private User creator;
   
   
   
   public Offre() { }
public Offre(int idService, String nom, Float prix, String descri, String[] imgs) {
	super();
	this.idService = idService;
	this.nom = nom;
	this.prix = prix;
	this.descri = descri;
	this.imgs = imgs;
}
public int getIdService() {
	return idService;
}
public void setIdService(int idService) {
	this.idService = idService;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Float getPrix() {
	return prix;
}
public void setPrix(Float prix) {
	this.prix = prix;
}
public String getDescri() {
	return descri;
}
public void setDescri(String descri) {
	this.descri = descri;
}
public String[] getImgs() {
	return imgs;
}
public void setImgs(String[] imgs) {
	this.imgs = imgs;
}
@Override
public String toString() {
	return "Service [idService=" + idService + ", nom=" + nom + ", prix=" + prix + ", descri=" + descri + ", imgs="
			+ Arrays.toString(imgs) + "]";
}
   

}