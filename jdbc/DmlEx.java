package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		(1)Loading driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jayathi","jayathi");
		
//		(3)Create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement Dml->executeUpdate();
		
//		stmt.executeUpdate("insert into person values(12,100,'jayathi','india')");
		
		stmt.addBatch("insert into person values(13,12,'apple','hyderabad')");
		stmt.addBatch("insert into person values(14,13,'orange','russia')");
		stmt.addBatch("insert into person values(15,14,'rose','china')");
		stmt.addBatch("insert into person values(16,15,'tulips','chennai')");
		stmt.addBatch("insert into person values(17,16,'lilly','korea')");
		stmt.addBatch("insert into person values(18,17,'dolly','india')");
		stmt.addBatch("insert into person values(19,18,'honey','Uk')");
		
		stmt.executeBatch();
		
//		(5)close the connections
		
		conn.close();
		
		System.out.println("Data is injected successfully");
	}
}
