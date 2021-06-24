package com.app.jobs.Models;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;
@Entity 
public class Categorie {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idCateg;
   private String nomCateg;
   private String DescriCateg; 
   @OneToMany(mappedBy = "categorie", targetEntity=Offre.class )  
	private List<Offre> offres; 
//   @OneToMany( targetEntity=Besoin.class )  
//	private List<Offre> besoins; 
   
	public Categorie() { }
	public Categorie(int idCateg, String nomCateg, String DescriCateg) {
	
		this.idCateg = idCateg;
		this.nomCateg = nomCateg;
		this.DescriCateg = DescriCateg;
	}
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
	@Override
	public String toString() {
		return "Categorie [idCateg=" + idCateg + ", nomCateg=" + nomCateg + ", DescriCateg=" + DescriCateg + "]";
	}


}