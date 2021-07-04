package com.app.jobs.Models;
 

import java.sql.Date;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
  
@Entity(name = "Offre") 
public class Offre {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idService;
   private String nom;
   private String prix; 
   private String descri;  
   private String address; 
   private Date date; 
   private String[] imgs;
   
   @OneToMany(mappedBy = "offre", fetch = FetchType.LAZY,  //nom de attr de rela
           cascade = CascadeType.ALL)
   private List<HistoTravaux> mes_travaux;
   
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "categorie_id", nullable = false)
   public Categorie categorie;
   
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "user_id", nullable = false) //fk column name
   public User creator;
   
   
   
   public Offre() { }
public Offre(int idService, String nom, String prix, String descri, String[] imgs) {
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
public String getPrix() {
	return prix;
}
public void setPrix(String prix) {
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

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Service [idService=" + idService + ", nom=" + nom + ", prix=" + prix + ", descri=" + descri + ", imgs="
			+ Arrays.toString(imgs) + "]";
}
public Offre(int idService, String nom, String prix, String descri, String address, Date date, String[] imgs,
		List<HistoTravaux> mes_travaux, Categorie categorie, User creator) {
	super();
	this.idService = idService;
	this.nom = nom;
	this.prix = prix;
	this.descri = descri;
	this.address = address;
	this.date = date;
	this.imgs = imgs;
	this.mes_travaux = mes_travaux;
	this.categorie = categorie;
	this.creator = creator;
}
   

}