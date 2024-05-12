package employee;
import java.sql.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String usernamme="root";
		String password="root";
		try {
			Connection con =DriverManager.getConnection(url, usernamme, password);
			Statement stmt=con.createStatement();
            String query ="select * from employee";
            ResultSet result=stmt.executeQuery(query);
            int count=0;
          	System.out.println("-----------------------------------------------------");
            System.out.println("empid   |empname  |post    salary     |");
          	System.out.println("-----------------------------------------------------");
            while(result.next()) {
            	int id=result.getInt(1);
            	name=result.getString(2);
            	String post=result.getString(3);
            	int salary=result.getInt(4);
            	System.out.println(name+"  |"+name+"    |"+post+"  |"+salary+" |");
            	System.out.println("-----------------------------------------------------");
            	count=count+1;
            	
            }
			
				
		}
		catch (SQLException e) {
			System.out.println("failure to select");
			e.printStackTrace();
		}

	}

}
