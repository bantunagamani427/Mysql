package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLCommands {

	public static void main(String[] args) throws SQLException {

		/*
		 * 1)Create the connection to the database
		 * 2)create the statement
		 * 3)Execute the Query
		 * 4)Close the connection
		 */
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		String s="INSERT INTO STUDENT VALUES(8,'AMMA',49)";
		
		Statement stmt=con.createStatement();
		stmt.execute(s);
		con.close();
		System.out.println("Query is executed.....");
		
	}

}
