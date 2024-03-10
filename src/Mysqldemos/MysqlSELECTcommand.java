package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSELECTcommand {

	public static void main(String[] args) throws SQLException {

		/*
		 * 1)Create Connection
		 * 2)Create statement/Query
		 * 3)Execute Query
		 * 4)Store it in result set
		 * 5)close the connection 
		 */
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_database","root","root");
		
		//In this we use database name of HR_DATABSE and seelct some columns and store 
		//that data into some variable result and print
		
		Statement stmt=con.createStatement();

		String s="SELECT  FIRST_NAME,LAST_NAME, DEPT_ID FROM EMPLOYEES";

		ResultSet result = stmt.executeQuery(s);
		while(result.next()) {//here it will check whether the next object is there then enter into the loop.
			String deptId=result.getString("DEPT_ID");
			String fname=result.getString("FIRST_NAME");
			String lname=result.getString("LAST_NAME");	
			System.out.println(deptId+"      "+fname+"      "+lname);
		}
		
		con.close();
		
		System.out.println("Query is executed and result is stored");
	}
}
