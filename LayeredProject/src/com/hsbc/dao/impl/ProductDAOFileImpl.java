package com.hsbc.dao.impl;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.hsbc.dao.IProductDAO;
import com.hsbc.exception.ProductException;
import com.hsbc.model.Product;

public class ProductDAOFileImpl implements IProductDAO {

	ObjectOutputStream oo;
	ObjectInputStream oi;
	
	public ProductDAOFileImpl(){
	// oo=new ObjectOutputStream(new FileOutputStream("productdata.txt"));
	// oi=new ObjectInputStream(new FileInputStream("productdata.txt"));
		try {
			oo=new ObjectOutputStream(new FileOutputStream("productdata.txt",true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void saveProduct(Product p) throws ProductException {
		// TODO Auto-generated method stub
		try {
			oo.writeObject(p);
		//	oo.flush();
		//	oo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Product updateProduct(Product p) throws ProductException {
		
		 try {
			
			oo=new ObjectOutputStream(new FileOutputStream("productdata.txt"));
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product p) throws ProductException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Product> findProducts() throws ProductException {
		HashMap<Integer,Product> temp=new HashMap<Integer,Product>();
		try {
			oi=new ObjectInputStream(new FileInputStream("productdata.txt"));
			Product p=(Product)oi.readObject();
			if(p!=null) {
				temp.put(p.getProductId(), p);
			}
			
			while(p!=null) {
				p=(Product)oi.readObject();
				temp.put(p.getProductId(),p);
				//System.out.println(p);
			}
			oi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}catch (StreamCorruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp.values();
	}

	@Override
	public Product findProductById(int productId) throws ProductException {
		Product p=null;
		try {
			oi=new ObjectInputStream(new FileInputStream("productdata.txt"));
			p=(Product)oi.readObject();
			if(p!=null) {
				if(p.getProductId()!=productId)
				{
					while(p!=null) {
						p=(Product)oi.readObject();
						if(p.getProductId()==productId)
						{
							break;
						}
					}
				}
			}
			
			
			oi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}catch (StreamCorruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

}
