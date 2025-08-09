package com.yuhan.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	
	public Connection connect(String url,String user,String password) {
		try {
            // Connect to DB
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
		} catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } 
		return null;
	}
	
	public void createTable(Connection conn,String query) throws SQLException {
		  Statement stmt = conn.createStatement();
          String createTable = query;
          stmt.executeUpdate(createTable);
	}
	
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/eden"; // DB name = school
        String user = "root"; // Your DB username
        String password = "root"; // Your DB password
        
        
        try {
            // Connect to DB
        	ConnectDB connectDB= new ConnectDB();
        	Connection conn =connectDB.connect(url, user, password);           
            System.out.println("✅ Connected to the database!");
            connectDB.createTable(conn, password);
            
            // Create table if not exists
            String createQuery="CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            connectDB.createTable(conn, createQuery);
            
            

            // Insert sample data
            String insert = "INSERT INTO students (name, marks) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, "Shineed");
            pstmt.setInt(2, 95);
            pstmt.executeUpdate();
            
            Statement stmt = conn.createStatement();
            // Retrieve and display data
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println("🧑 Name: " + rs.getString("name") + " | Marks: " + rs.getInt("marks"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
