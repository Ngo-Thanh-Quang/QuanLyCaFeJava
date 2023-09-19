package QuanLyQuanCafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class main {
	
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlcafe;user=sa;password=123456");
			System.out.println("Kết nối thành công!");
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Kết nối thất bại!");
			e.printStackTrace();
		}
	
		new QuanLyQuanCafe();
	}
}
