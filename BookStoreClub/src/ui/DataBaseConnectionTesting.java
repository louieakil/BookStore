package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DataBaseConnectionTesting {

	public static void main(String[] args) {
		
		try {
			
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		
		Connection con = DriverManager.getConnection("jdbc:derby://localhost/library");
		
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery("Select * from materials");
		
		//Result set output
		while (rs.next())
		{
			System.out.println(rs.getString("title"));
		}
		
		
		
		
		rs.close();
		stm.close();
		con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error Something went wrong");
			System.out.println(e);
		}

	}

}
