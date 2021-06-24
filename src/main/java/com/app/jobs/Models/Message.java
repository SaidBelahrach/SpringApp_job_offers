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
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne; 
//
//@Entity 
//public class Message {
//   @Id
//   @GeneratedValue(strategy= GenerationType.AUTO)
//   @Column(updatable = false, nullable = false)
//   private int idMsg;
//   private String msg;
//   private Date date; 
//   private Boolean isread;
//   private String type;//txt or img  
//   private String img;
//   @ManyToOne   
//  		private Discussion discussion;
//   @OneToOne
//		private User sender;
//   @OneToOne
//   		private User receiver;
//   public Message() { }
//	public Message(int idMsg, String msg, Date date, Boolean isread, String type, String img, Discussion discussion) {
//		super();
//		this.idMsg = idMsg;
//		this.msg = msg;
//		this.date = date;
//		this.isread = isread;
//		this.type = type;
//		this.img = img;
//		this.discussion = discussion;
//	}
//	public int getIdMsg() {
//		return idMsg;
//	}
//	public void setIdMsg(int idMsg) {
//		this.idMsg = idMsg;
//	}
//	public String getMsg() {
//		return msg;
//	}
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	public Boolean getIsread() {
//		return isread;
//	}
//	public void setIsread(Boolean isread) {
//		this.isread = isread;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getImg() {
//		return img;
//	}
//	public void setImg(String img) {
//		this.img = img;
//	}
//	public Discussion getDiscussion() {
//		return discussion;
//	}
//	public void setDiscussion(Discussion discussion) {
//		this.discussion = discussion;
//	}
//	@Override
//	public String toString() {
//		return "Message [idMsg=" + idMsg + ", msg=" + msg + ", date=" + date + ", isread=" + isread + ", type=" + type
//				+ ", img=" + img + ", discussion=" + discussion + "]";
//	}
//   
//}