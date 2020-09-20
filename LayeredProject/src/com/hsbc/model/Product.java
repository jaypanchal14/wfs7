package com.hsbc.model;

import java.io.Serializable;

public class Product implements Serializable {

	String productName;
	Integer productId;
	double productPrice;
	Integer quantity;
	String category;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(String productName, int productId, double productPrice, int quantity, String category) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.category = category;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", category=" + category + "]";
	}
	
}
