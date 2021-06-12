package Models;
 

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany; 

@Entity 
public class User {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(updatable = false, nullable = false)
   private int idUser;
   private String email;
   private String password; 
   private String nomComplet;
   private String tel;
   private String adress;
   private Boolean isConnected; 
   private String imgPath;
   @OneToMany( targetEntity=Besoin.class )  
	private List<Offre> besoins; 
   @OneToMany( targetEntity=Demande.class )  
	private List<Offre> demandes; 
   @OneToMany( targetEntity=Comment.class )  
	private List<Offre> comments; 
   public User() { }
public int getIdUser() {
	return idUser;
}
public void setIdUser(int idUser) {
	this.idUser = idUser;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNomComplet() {
	return nomComplet;
}
public void setNomComplet(String nomComplet) {
	this.nomComplet = nomComplet;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public Boolean getIsConnected() {
	return isConnected;
}
public void setIsConnected(Boolean isConnected) {
	this.isConnected = isConnected;
}
public String getImgPath() {
	return imgPath;
}
public void setImgPath(String imgPath) {
	this.imgPath = imgPath;
}
public User(int idUser, String email, String password, String nomComplet, String tel, String adress,
		Boolean isConnected, String imgPath) {
	super();
	this.idUser = idUser;
	this.email = email;
	this.password = password;
	this.nomComplet = nomComplet;
	this.tel = tel;
	this.adress = adress;
	this.isConnected = isConnected;
	this.imgPath = imgPath;
}
@Override
public String toString() {
	return "User [idUser=" + idUser + ", email=" + email + ", password=" + password + ", nomComplet=" + nomComplet
			+ ", tel=" + tel + ", adress=" + adress + ", isConnected=" + isConnected + ", imgPath=" + imgPath + "]";
}
   
   
}