package com.example.Model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carpenter")
public class Carpenter {
	
	@Id
	
	@Column(name="user_email",unique = true)
	
	private String User_Email;
	
	@Column(name="userfirstname")
	private String UserFirstName;
	
	@Column(name="userlastname")
	private String UserLastName;
	
	@Column(name="preferredarea")
	private String[] PreferredArea;
	
	@Column(name="latitude")
	private String Latitiude;
	
	@Column(name="longitude")
	private String Longitude;
	
	@Column(name="phonenumber")
	private BigInteger PhoneNumber;
	
	public Carpenter()
	{
		
	}
	public Carpenter(String User_Email, String userFirstName, String userLastName, String[] preferredArea, String latitiude,
			String longitude, BigInteger phoneNumber) {
		super();
		this.User_Email = User_Email;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		PreferredArea = preferredArea;
		Latitiude = latitiude;
		Longitude = longitude;
		PhoneNumber = phoneNumber;
	}
	
	public String getUser_Email() {
		return User_Email;
	}
	public void setUser_Email(String User_Email) {
		this.User_Email = User_Email;
	}
	public String getUserFirstName() {
		return UserFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}
	public String getUserLastName() {
		return UserLastName;
	}
	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}
	public String[] getPreferredArea() {
		return PreferredArea;
	}
	public void setPreferredArea(String[] preferredArea) {
		PreferredArea = preferredArea;
	}
	public String getLatitiude() {
		return Latitiude;
	}
	public void setLatitiude(String latitiude) {
		Latitiude = latitiude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public BigInteger getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	

}
