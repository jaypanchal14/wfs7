package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseClass {
	static Connection getConnect(){
		Connection con = null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con = DriverManager.getConnection("jdbc:derby:MyDB;create=true");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}	
}