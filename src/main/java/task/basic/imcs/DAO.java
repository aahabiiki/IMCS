package task.basic.imcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {	
	
	

	public static void main(String[] args)throws Exception {
		String url = "jdbc:mysql://localhost:3306:employee";
		String username = "root";
		String password = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		Connection	connect= DriverManager.getConnection(url, username, password);
			
		ResultSet  rs = connect.createStatement().executeQuery("select * from employee.employee.detail");
		
		 
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
		
	}

