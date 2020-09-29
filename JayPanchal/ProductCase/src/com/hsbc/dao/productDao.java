package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Product;

public interface productDao {
	void saveProduct(Product p);
	void deleteProduct(String productID);
	void updateProduct(String productID);
	List<Product> getProducts();
}
