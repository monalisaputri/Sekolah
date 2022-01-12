package org.itenas.oop.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//di class DatabaseUtil ini blm ada yang diubah sama kyk contoh si bapa kasih

public class DatabaseUtil {
	//url database
		static final String DB_URL = "jdbc:mysql://localhost/siswa_management";
		String user = "root";
		String password = "basdat2020";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		public void connect() {
			try {
				connection = DriverManager.getConnection(DB_URL, user, password);
			} catch (Exception e) {
				System.out.println("Terjadi error: " + e.getMessage());
			}
		}
		
		public void disconnect() {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (Exception e) {
				System.out.println("Terjadi error: " + e.getMessage());
			}
		}
		
		public ResultSet readData(String query) {
	        try {
	 
	            statement = connection.createStatement();
	                                    
	            resultSet = statement.executeQuery(query);
	 
	            return resultSet;
	 
	        } 
	        catch (SQLException ex) {
	            System.out.println("Terjadi error: " + ex.getMessage());
	        }                                                    
	 
	        return resultSet;
	    }
	 
	    public void executeQuery(String query) {
	        try {
	            statement = connection.createStatement();
	                                    
	            statement.executeUpdate(query);
	            
	        } 
	        catch (SQLException ex) {
	            System.out.println("Terjadi error: " + ex.getMessage());
	        }
	    }
	}