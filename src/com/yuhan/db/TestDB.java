package com.yuhan.db;

public class TestDB {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/eden"; // DB name = school
		String user = "root"; // Your DB username
		String password = "root"; // Your DB password
		ConnectDB connectDB = new ConnectDB();
		connectDB.connect(url, user, password);
	}
}
