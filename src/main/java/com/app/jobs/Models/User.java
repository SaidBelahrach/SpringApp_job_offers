package com.app.jobs.Models;
 
 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore; 
@Entity 
public class User {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idUser;
   private String email;
   private String password; 
   private String nomComplet;
   private String idFirebase;
   private String tel;
   private String adress;
   private String specialite;
   private Boolean isConnected; 
   private String imgPath;
   
   @JsonIgnore
   @OneToMany(mappedBy = "user_rator", targetEntity=Rating.class)
   private List<Rating> user_ratings;
   
   @JsonIgnore
   @OneToMany(mappedBy = "creator", targetEntity=Offre.class )  
	public List<Offre> user_offres; 
   
//   @OneToMany(mappedBy = "commenter", targetEntity=Comment.class )  
//	private List<Offre> user_comments;  
      
//   @OneToMany( targetEntity=Besoin.class )  
//	private List<Besoin> besoins; 
//   @OneToMany( targetEntity=Demande.class )  
//	private List<Demande> demandes; 
//   @OneToMany( targetEntity=Comment.class )  
//	private List<Comment> comments; 
//   @OneToMany( targetEntity=Rating.class )  
//	private List<Rating> rating; 
//   @OneToMany( targetEntity=Reclamation.class )  
//	private List<Reclamation> reclamations; 
   public User() { }
public int getIdUser() {
	return idUser;
}
public void setIdUser(int idUser) {
	this.idUser = idUser;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
//public String getPassword() {
//	return password;
//}
public void setPassword(String password) {
	this.password = password;
}
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Boolean getIsConnected() {
	return isConnected;
}
public void setIsConnected(Boolean isConnected) {
	this.isConnected = isConnected;
}
public String getImgPath() {
	return imgPath;
}
public void setImgPath(String imgPath) {
	this.imgPath = imgPath;
}

public String getIdFirebase() {
	return idFirebase;
}
public void setIdFirebase(String idFirebase) {
	this.idFirebase = idFirebase;
}
  
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public String getPassword() {
	return password;
}
 
public User(int idUser, String email, String password, String nomComplet, String idFirebase, String tel, String adress,
		String specialite, Boolean isConnected, String imgPath, List<Rating> user_ratings, List<Offre> user_offres) {
	super();
	this.idUser = idUser;
	this.email = email;
	this.password = password;
	this.nomComplet = nomComplet;
	this.idFirebase = idFirebase;
	this.tel = tel;
	this.adress = adress;
	this.specialite = specialite;
	this.isConnected = isConnected;
	this.imgPath = imgPath;
	this.user_ratings = user_ratings;
	this.user_offres = user_offres;
}
@Override
public String toString() {
	return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", nomComplet=" + nomComplet
			+ ", tel=" + tel + ", adress=" + adress + ", isConnected=" + isConnected + ", imgPath=" + imgPath + "]";
}
   
   
}