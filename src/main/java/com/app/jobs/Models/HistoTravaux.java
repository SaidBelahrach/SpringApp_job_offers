package com.app.jobs.Models;
 

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne; 

@Entity 
public class HistoTravaux {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int id;
   private String description;
   private String img; 
   private Date date;
  // @ManyToOne
   	//	public Categorie Offre; 
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "offre_id", nullable = false)
   private Offre offre;
   
   public HistoTravaux() { }

}