package employee;
import java.sql.*;

public class Deletion {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employeedb";
		String username="root";
		String password="root";
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			String query="delete from employee where empid in (?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, 100);
			stmt.setInt(2, 103);
			int deleted=stmt.executeUpdate();
			if(deleted >0)
			{
				System.out.println("deletion sussessfull");
			}
			else {
				System.out.println("no such records");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println("failura to delete ");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
