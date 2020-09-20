package com.hsbc.caller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import com.hsbc.dao.IProductDAO;
import com.hsbc.dao.impl.ProductDAOCollectionImpl;
import com.hsbc.dao.impl.ProductDAOFileImpl;
import com.hsbc.exception.ProductException;
import com.hsbc.model.Product;

public class Caller {

	public static void main(String[] args) {
	
		
		//IProductDAO productDao=new ProductDAOCollectionImpl();
		Properties prop=new Properties();
		String strs="";
		try {
			prop.load(new FileInputStream("myprop.properties"));
			strs=(String) prop.get("com.hsbc.dao.impl.ProductDAO");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IProductDAO productDao;
		try {
			productDao = (IProductDAO)Class.forName(strs).newInstance();
			
			try {
				Product p1=new Product("Monitor", 101, 13000, 10, "Computer");
				Product p2=new Product("Keyboard", 102, 1300, 10, "Computer");
				Product p3=new Product("Mouse", 103, 800, 10, "Computer");
				Product p4=new Product("Scanner", 104, 23000, 10, "Computer");
					
			
				productDao.saveProduct(p1);
				productDao.saveProduct(p2);
				productDao.saveProduct(p3);
				productDao.saveProduct(p4);
				
			} catch (ProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				Collection<Product> products=productDao.findProducts();
				for(Product prod:products)
				{
					System.out.println(prod);
				}
			} catch (ProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Product product=productDao.findProductById(103);
				System.out.println("****************************");
				System.out.println("Product Detail : " +product);
			} catch (ProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		p3.setProductPrice(900);
//		Product p5=new Product();
//		try {
//			productDao.updateProduct(p5);
//		} catch (ProductException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
	}

}
