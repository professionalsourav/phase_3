package com.restapi.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	// productId, productName, season, brand, category, 
	// price, color, createdDate, discount, quantity
	
	@Id
	private int productid;
	private String productname;
	private String season;
	private String brand;
	private String catagory;
	private int price;
	private String color;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date date;
	private int discount;
	private int quantity;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, String season, String brand, String catagory, int price,
			String color, Date date, int discount, int quantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.season = season;
		this.brand = brand;
		this.catagory = catagory;
		this.price = price;
		this.color = color;
		this.date = date;
		this.discount = discount;
		this.quantity = quantity;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", season=" + season + ", brand="
				+ brand + ", catagory=" + catagory + ", price=" + price + ", color=" + color + ", date=" + date
				+ ", discount=" + discount + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
}
