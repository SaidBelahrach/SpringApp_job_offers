//package com.app.jobs.Models;
// 
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne; 
//
//@Entity 
//public class Discussion {
//   @Id
//   @GeneratedValue(strategy= GenerationType.AUTO)
//   @Column(updatable = false, nullable = false)
//   private int idDiscu; 
//   @OneToOne
//		private User user1;
//   @OneToOne
//   		private User user2;
//   @OneToMany
//   		private List<Message> messages;
//   public Discussion() { }
//   
//}