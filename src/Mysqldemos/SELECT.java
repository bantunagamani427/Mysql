package Mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECT {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_database","root","root");
		Statement stmt=con.createStatement();
		//stmt.execute(s);
	}
}
