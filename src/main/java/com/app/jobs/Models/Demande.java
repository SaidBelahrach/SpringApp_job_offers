//package com.app.jobs.Models;
// 
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany; 
//
//@Entity 
//public class Demande {
//   @Id
//   @GeneratedValue(strategy= GenerationType.AUTO)
//   @Column(updatable = false, nullable = false)
//   private int idRating;
//   private String points;
//   private String comment;
//   private Date date;
//   @ManyToOne
//   		public User rater;
//   @ManyToOne
//		public Offre offre;
//   
//   		
//   public Demande() { }
//
//
//public Demande(int idRating, String points, String comment, Date date, User rater, Offre offre) {
//	super();
//	this.idRating = idRating;
//	this.points = points;
//	this.comment = comment;
//	this.date = date;
//	this.rater = rater;
//	this.offre = offre;
//}
//
//
//public int getIdRating() {
//	return idRating;
//}
//
//
//public void setIdRating(int idRating) {
//	this.idRating = idRating;
//}
//
//
//public String getPoints() {
//	return points;
//}
//
//
//public void setPoints(String points) {
//	this.points = points;
//}
//
//
//public String getComment() {
//	return comment;
//}
//
//
//public void setComment(String comment) {
//	this.comment = comment;
//}
//
//
//public Date getDate() {
//	return date;
//}
//
//
//public void setDate(Date date) {
//	this.date = date;
//}
//
//
//public User getRater() {
//	return rater;
//}
//
//
//public void setRater(User rater) {
//	this.rater = rater;
//}
//
//
//public Offre getOffre() {
//	return offre;
//}
//
//
//public void setOffre(Offre offre) {
//	this.offre = offre;
//}
//
//
//@Override
//public String toString() {
//	return "Demande [idRating=" + idRating + ", points=" + points + ", comment=" + comment + ", date=" + date
//			+ ", rater=" + rater + ", offre=" + offre + "]";
//}
//
//}