package employee;
import java.sql.*;


public class Updation {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employeedb";
		
		String username ="root";
		String password="root";
		try{
			Connection con =DriverManager.getConnection(url,username,password);
			
			String query="update employee set empname=? where empid=? ";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1,"raagav");
			stmt.setInt(2, 102);
			int update=stmt.executeUpdate();
			if(update>0) {
				System.out.println("rows updated successfully");
			}
			
			
		}
		catch(SQLException e)
		{
			System.out.println("failed to update");
			e.printStackTrace();
		}
		

	}

}
