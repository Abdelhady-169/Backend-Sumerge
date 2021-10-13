import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

public class JavaSQL {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/empproject";
		String username = "root";
		String password = "Abdelhady99";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out,println("connected to database");
			
		} catch (SQLException e) {
			System.out.println("oops, error!");
			e.printStackTrace();
		}
		
	}

}
