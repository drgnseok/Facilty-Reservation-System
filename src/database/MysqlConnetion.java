package database;

import java.sql.*;


public class MysqlConnetion {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Connection getConnection() {
	      return conn;
	   }
	
	
	public MysqlConnetion() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
		
		System.out.println("연결 성공");

	}

}
