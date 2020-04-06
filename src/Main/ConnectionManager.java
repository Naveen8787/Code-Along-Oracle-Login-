package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws SQLException,ClassNotFoundException {
		//Register the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//Create the connection object
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:DB","SYSTEM","Naveen8787");
		if(con!=null)
			System.out.println("Established");

		return con;
	}

}
