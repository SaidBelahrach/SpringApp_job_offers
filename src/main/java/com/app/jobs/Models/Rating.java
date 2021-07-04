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
   private String points;
   private String comment;
   private Date date;

   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "offre_id", nullable = false) //fk column name
   public Offre rated_offre;
   
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   @ManyToOne( fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "rator_id", nullable = false) //fk column name
   public User user_rator;
   		
   public Rating() { }

public Rating(int num, String points, String comment, Date date) {
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

public String getPoints() {
	return points;
}

public void setPoints(String points) {
	this.points = points;
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

@Override
public String toString() {
	return "Demande [num=" + num + ", points=" + points + ", comment=" + comment + ", date=" + date + "]";
}
   

}