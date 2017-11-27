package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySql {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded!");
		
		Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumfazedb",
									"root", "Rootmysql5.R");
		System.out.println("Connected to mysql DB!");
		
		//executing database queries
		Statement sqlStObj = connectionObj.createStatement();
		ResultSet resSetObj = sqlStObj.executeQuery("select * from userstable");
		
		while(resSetObj.next()) {
			String username = resSetObj.getString("firstName");
			System.out.println("User: " + username);
			
			String email = resSetObj.getString("email");
			System.out.println("Email: " + email);
		}
	}

}
