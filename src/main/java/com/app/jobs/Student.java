package com.app.jobs;
//package com.app.demo;
// 
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id; 
//
//@Entity 
//public class Student {
//   @Id
//   @GeneratedValue(strategy= GenerationType.AUTO)
//   @Column(updatable = false, nullable = false)
//   private int id;
//   private String studentname;
//   private String course;
//   private int fee;
//	public Student() { }
//	public Student(int id, String studentname, String course, int fee) {
//	
//		this.id = id;
//		this.studentname = studentname;
//		this.course = course;
//		this.fee = fee;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getStudentname() {
//		return studentname;
//	}
//	public void setStudentname(String studentname) {
//		this.studentname = studentname;
//	}
//	public String getCourse() {
//		return course;
//	}
//	public void setCourse(String course) {
//		this.course = course;
//	}
//	public int getFee() {
//		return fee;
//	}
//	public void setFee(int fee) {
//		this.fee = fee;
//	}
//
//}