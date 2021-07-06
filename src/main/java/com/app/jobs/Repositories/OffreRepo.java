package com.app.jobs.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.jobs.Models.Offre;
 

public interface OffreRepo extends JpaRepository<Offre, Integer> {
//	   @Query("SELECT o FROM offre o WHERE LOWER(o.nom) = LOWER(:nom)")
//	   public List<Offre> find( @Param("nom") String nom,
//			   					@Param("adress") String adress,
//			   					@Param("categorie") String categorie
//			   					);
}
