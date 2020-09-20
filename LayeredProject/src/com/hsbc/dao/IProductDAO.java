package com.hsbc.dao;

import java.util.Collection;
import java.util.List;

import com.hsbc.exception.ProductException;
import com.hsbc.model.Product;

public interface IProductDAO {
	
	void saveProduct(Product p) throws ProductException;
	Product updateProduct(Product p) throws ProductException;
	void deleteProduct(Product p) throws ProductException;
	Collection<Product> findProducts() throws ProductException;
	Product findProductById(int productId) throws ProductException;

}
