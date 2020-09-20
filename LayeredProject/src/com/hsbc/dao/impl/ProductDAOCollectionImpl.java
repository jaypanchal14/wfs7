package com.hsbc.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.hsbc.dao.IProductDAO;
import com.hsbc.exception.ProductException;
import com.hsbc.model.Product;

public class ProductDAOCollectionImpl implements IProductDAO {

	HashMap<Integer, Product> product=new HashMap<Integer, Product>();
	@Override
	public void saveProduct(Product p) throws ProductException {
		product.put(p.getProductId(), p);
	}

	@Override
	public Product updateProduct(Product p) throws ProductException {
		if(product.get(p.getProductId())!=null)
			product.put(p.getProductId(),p);
		else
			throw new ProductException("Product does not exist to be updated..");
		return p;
	}

	@Override
	public void deleteProduct(Product p) throws ProductException {
		if(product.get(p.getProductId())!=null)
			product.remove(p.getProductId());
		else
			throw new ProductException("Product does not exist to be deleted");
	}

	@Override
	public Collection<Product> findProducts() throws ProductException {
		return product.values();
	}

	@Override
	public Product findProductById(int productId) throws ProductException {
		if(product.get(productId)!=null)
			return (Product)product.get(productId);
		else
			throw new ProductException("Product does not exist");
	}

}
