package lendinglibrary.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseTest {
	
	public static void main(String[] args) {
		RetrieveResultSet("SELECT * from MATERIALS");
		ChangeData("Update Materials set title = ? where id = ?","A Second Test",1);
;	}

	public static void ChangeData(String sql, String title,int id){
		Connection conn = null;
		PreparedStatement stm = null;
		
		try
		{
			try
			{
				
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");
				stm = conn.prepareStatement(sql);
				stm.setString(1, title);
				stm.setInt(2, id);
				int results = stm.executeUpdate();
				
				System.out.println(results);
				
			}
			finally
			{
				if(stm != null){
					stm.close();
				}
				if(conn != null){
					conn.close();
				}
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error   " + e);
		}
		catch(SQLException e)
		{
			System.out.println("Error   " + e);
		}
	}
	
	public static void RetrieveResultSet(String sql) {

		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try
		{
			try
			{
				
			
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				
				conn = DriverManager.getConnection("jdbc:derby://localhost/library");
				
				stm = conn.createStatement();
				
				rs = stm.executeQuery(sql);
				
				while(rs.next())
				{
					String title = rs.getString("title");
					System.out.println(title);
				}
			}
			finally
			{
				if(rs != null){
					rs.close();					
				}
				if(stm != null){
					stm.close();
				}
				if(conn != null){
					conn.close();
				}
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error   " + e);
		}
		catch(SQLException e)
		{
			System.out.println("Error   " + e);
		}

	}

}
