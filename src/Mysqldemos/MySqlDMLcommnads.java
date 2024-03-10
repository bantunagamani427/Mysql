package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLcommnads {
/*
 * 1)Create a connection to the Database
 * 2)Create a Statement/Query
 * 3)Execute Statement/Query
 * 4)Close Connection to the database
 */
	public static void main(String[] args) throws SQLException {
		
		//Create the coonection to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		/*
		 * To establish the connection to database we have connection class and one more 
		 * class is DriverManagaer and getConnection is a method.All the class are imported from mysql.java.
		 * To establish the connection we need to pass login details like mysql(un-root,pwd-root).
		 * we need to pass connection
		 * string,and this string is vary from database to databse.that string is
		 * "jdbc:mysql://localhost:3306/mydb","root",root"
		 * "jdbc:mysql://hostname:portname/database name what we want to coonect","username","password"
		 */
		//Create the Statement/Query
		Statement stmt=con.createStatement();
		/*
		 * To create the statement we have Statement class.with the help of the connection(con)
		 * we can create the statemnet.
		 * before executing the query we need to insert the query.so create the string query.      
		 */
		//String s="INSERT INTO STUDENT VALUES(103,'ATHA',56)";
		//String s="UPDATE STUDENT SET SNAME = 'MAMA' WHERE SNO=103";
		String s="DELETE FROM STUDENT WHERE SNO=103";
		//Execute the statement.here pass the variable s
		
        stmt.execute(s); 	
        
		//close the connection
        
        con.close();
	System.out.println("Query is executed......");

	}
}
