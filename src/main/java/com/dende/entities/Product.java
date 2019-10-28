package com.dende.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name = "image")
	private String image;
	
	@Column(name="old_price")
	private int oldPrice;
	
	@Column(name="new_price")
	private int newPrice;
	
	public Product() {
		
	}
	
	public Product(String id, String produtcName, String image, int oldPrice, int newPrice) {
		this.id = id;
		this.productName = produtcName;
		this.image = image;
		this.oldPrice = oldPrice;
		this.newPrice = newPrice;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setOldPrice(int oldPrice) {
		this.oldPrice = oldPrice;
	}
	
	public int getOldPrice() {
		return oldPrice;
	}
	
	public void setNewPrice(int newPrice) {
		this.newPrice = newPrice;
	}
	
	public int getNewPrice() {
		return newPrice;
	}
}
