package loadregister;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Establishconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.get the connection
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","PHW#84#jeor");
			
			
			// 3. create statement
			Statement s=c.createStatement();
			
			// 4.execute  query
			s.executeUpdate("insert into emp values(1,'tom',15000,'developer','tom@gamil.com')");
			
			System.out.println("data inserted successfully");
			
//		System.out.println(c);
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}

	}

}
