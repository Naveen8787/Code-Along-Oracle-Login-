package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean validate(Login login) throws ClassNotFoundException, SQLException {
		String username=login.getUsername();
		String password=login.getPassword();
		
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from USERDETAILS");
		while(rs.next()) 
		{
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
			{
				con.getConnection().close();
				return true;

				}
			else {
				con.getConnection().close();
				return false;

			}
		}
		return true;
	}
}
	
