package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECTPractice {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HR_DATABASE","root","root");
		
		Statement stmt=con.createStatement();
		String s="SELECT EMP_ID,FIRST_NAME,LAST_NAME FROM EMPLOYEES";
		
		ResultSet result=stmt.executeQuery(s);
		while(result.next()) {
			String emp_id=result.getString("EMP_ID");
			String first_name=result.getString("FIRST_NAME");
			String last_name=result.getString("LAST_NAME");
		System.out.println(emp_id+"  "+first_name+"  "+last_name);
		}
		con.close();
		
		System.out.println("Query is executed...........");
	}
}
