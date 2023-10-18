package loadregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crud {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.get the connection
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies_db","root","PHW#84#jeor");
			
			
			// 3. create statement
			Statement s=c.createStatement();
			
			// 4.execute  query
			s.executeUpdate("insert into movie values(1,'dhanush','santhosh','priyangamohan','gvprakash',10)");
			s.executeUpdate("insert into movie values(2,'vijay','loki','trisha','ani',9)");
			s.executeUpdate("insert into movie values(3,'rajini','nelson','tamana','aniruth',7)");
			s.executeUpdate("insert into movie values(4,'fafa','lokesh','gayathri','aniruth',8)");
			
			System.out.println("data inserted successfully");
			
			s.executeUpdate("delete from movie where movieid=3");
			System.out.println("deleted successfully");
			
			s.executeUpdate("update movie set rating=9 where movieid=4");
			System.out.println("updated successfully");
			
//		System.out.println(c);
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}


	}

}
