package com.app.jobs.Models;
import java.util.Date; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 

@Entity 
public class Rating {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int num;
   private int points;
   private String comment;
   private String date;

   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "offre_id", nullable = false) //fk column name
   public Offre rated_offre;
   
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "rator_id", nullable = false) //fk column name
   public User user_rator;
   		
   public Rating() { }

	public Rating(int num, int points, String comment, String date) {
		super();
		this.num = num;
		this.points = points;
		this.comment = comment;
		this.date = date;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Offre getRated_offre() {
		return rated_offre;
	}
	
	public void setRated_offre(Offre rated_offre) {
		this.rated_offre = rated_offre;
	}
	
	public User getUser_rator() {
		return user_rator;
	}
	
	public void setUser_rator(User user_rator) {
		this.user_rator = user_rator;
	}
	
	@Override
	public String toString() {
		return "Rating [num=" + num + ", points=" + points + ", comment=" + comment + ", date=" + date + ", rated_offre="
				+ rated_offre + ", user_rator=" + user_rator + "]";
	} 

}