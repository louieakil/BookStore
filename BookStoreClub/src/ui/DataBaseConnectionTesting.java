package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseConnectionTesting {

	public static void main(String[] args) {
		ChangeData("Update Materials set title = ? where id = ?", "A second test", 1);
		RetrieveResultSet("Select * from Materials");

	}
	
	
	
	public static void ChangeData(String sql, String title, int id)
	{
		Connection con = null;
		PreparedStatement stm = null;
		
		try {

			try 
			{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				con = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = con.prepareStatement(sql);
				stm.setString(1, title);
				stm.setInt(2, id);
				int results = stm.executeUpdate();
				
				System.out.println("Records amended: " + results);
				//Result set output
			}
			finally
			{
				if(stm !=null) stm.close();
				if(con != null)con.close();
				{
					con.close();
				}

			}

		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error Something went wrong");
			System.out.println(e);
		}
		catch(SQLException e)
		{

			System.out.println("Error Something went wrong");
			System.out.println(e);
		}

	}
	
	
	public static void RetrieveResultSet(String sql) {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {

			try 
			{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				con = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = con.createStatement();
				rs = stm.executeQuery("Select * from materials");
				//Result set output
				while (rs.next())
				{
					System.out.println(rs.getString("title"));
				}
			}
			finally
			{
				if(rs != null) rs.close();
				if(stm !=null) stm.close();
				if(con != null)con.close();
				{
					con.close();
					System.out.println("Connection was closed");
				}

			}

		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error Something went wrong");
			System.out.println(e);
		}
		catch(SQLException e)
		{

			System.out.println("Error Something went wrong");
			System.out.println(e);
		}

	}

}
