package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Product;

public class ProductDaoImpl implements productDao{
	Connection conn = DatabaseClass.getConnect();
	
	@Override
	public void saveProduct(Product p) {
		String saveQuery = "Insert into Product values(?,?,?,?,?,?)";
		try {
			PreparedStatement stat = conn.prepareStatement(saveQuery);
			stat.setString(1, p.getProductId());
			stat.setString(2, p.getProductName());
			stat.setString(3, p.getCategory());
			stat.setInt(4, p.getPrice());
			stat.setInt(5, p.getQuantity());
			stat.setInt(6, p.getRol());
			int i = stat.executeUpdate();
			if(i>0){
				System.out.println("Record Inserted.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void deleteProduct(String productID) {
		String deleteQuery = "Delete from Product where productId=?";
		try {
			PreparedStatement stat = conn.prepareStatement(deleteQuery);
			stat.setString(1, productID);
			int i = stat.executeUpdate();
			if(i>0){
				System.out.println("Record Deleted.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(String productID) {
		String updateQuery = "Update Product set quantity=? where ProductId=?";
		try {
			PreparedStatement stat = conn.prepareStatement(updateQuery);
			stat.setInt(1, 10);
			stat.setString(2, productID);
			int i = stat.executeUpdate();
			if(i>0){
				System.out.println("Record Updated.");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getProducts() {
		List<Product> list = new ArrayList<Product>();
		String listQuery = "Select * from Product";
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(listQuery);
			while(rs.next()){
				list.add(new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}	
}