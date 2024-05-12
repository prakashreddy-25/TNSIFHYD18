package employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/employeedb";
		String username ="root";
		String password ="root";
		try {
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null) {
			System.out.println("database connection successful ");
			
		}
}
		catch(SQLException e) {
		System.out.println("failure ");
				e.printStackTrace();
			
		}

}
}