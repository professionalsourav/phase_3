package com.restapi.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	//userID, username, password, email, phone_number
	@Id
	private int userid;
	private String username;
	private String password;
	private String email;
	private Long phonenumber;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(int userid, String username, String password, String email, Long phonenumber, List<Product> products) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
		this.products = products;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", products=" + products + "]";
	}
	
	
	
	
	
}
