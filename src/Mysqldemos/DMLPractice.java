package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLPractice {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HR_DATABASE","root","root");
		
		Statement stmt=con.createStatement();
		
		String s="INSERT INTO PARENT VALUES(101,'NAGA',78)";
		
		stmt.execute(s);
		System.out.println("Query executed....");
	}
}
