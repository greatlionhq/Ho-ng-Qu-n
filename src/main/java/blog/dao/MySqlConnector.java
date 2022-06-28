package blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnector {

	public static Connection conn;

	public static Connection getPreparedConnection() {

		if (conn == null) {
			String url = "jdbc:mysql://localhost:3306/blog";
			String username = "root";
			String password = "";

			conn = getConnection(url, username, password);
		}
		
		return conn;
	}

	public static Connection getConnection(String url, String username, String password) {
		while (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
		
	}

}
