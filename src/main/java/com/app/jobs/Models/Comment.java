//package com.app.jobs.Models;
// 
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id; 
//
//@Entity 
//public class Comment {
//   @Id
//   @GeneratedValue(strategy= GenerationType.AUTO)
//   @Column(updatable = false, nullable = false)
//   private int idComment;
//   private String txt;
//   private Date date; 
//   public Comment() { }
//public int getIdComment() {
//	return idComment;
//}
//public void setIdComment(int idComment) {
//	this.idComment = idComment;
//}
//public String getTxt() {
//	return txt;
//}
//public void setTxt(String txt) {
//	this.txt = txt;
//}
//public Date getDate() {
//	return date;
//}
//public void setDate(Date date) {
//	this.date = date;
//}
//public Comment(int idComment, String txt, Date date) {
//	super();
//	this.idComment = idComment;
//	this.txt = txt;
//	this.date = date;
//}
//@Override
//public String toString() {
//	return "Comment [idComment=" + idComment + ", txt=" + txt + ", date=" + date + "]";
//}
//   
//   
//   
//}