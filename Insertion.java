package employee;

import java.sql.*;


public class Insertion {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/employeedb";
		String username ="root";
		String password="root";
		try {
			Connection con =DriverManager.getConnection(url,username,password);
			String query="insert into employee(empid,empname,post,salary) values (?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1,101);
			stmt.setString(2,"partha");
			stmt.setString(3,"developer");
			stmt.setInt(4,45000);
			int insertedRows=stmt.executeUpdate();
			if(insertedRows>0 ) {
				System.out.println("inserted successfully");
			}		

		}
		catch(SQLException e) {
			System.out.println("insertion failed");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
