package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DdlEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		(1)Loading driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jayathi","jayathi");
		
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement DDL - execute();
		
		stmt.execute("create table person(age number(10),id number(10),name varchar2(10),address varchar2(10))");
		
//		(5)close the connections
		
		conn.close();
		
		
	}

}
