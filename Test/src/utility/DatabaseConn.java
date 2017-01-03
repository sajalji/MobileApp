package utility;

import java.sql.*;

public class DatabaseConn {
	final static String myDriver = "com.mysql.cj.jdbc.Driver";
	final static String DBurl = "jdbc:mysql://localhost:3306/world";
	final static String username = "root";
	final static String password = "reddevil";
	Connection conn = null;
	Statement stmt = null;

	public Connection connection() throws SQLException {

		LogClass L = new LogClass("log");
		L.logger(DatabaseConn.class);

		try {
			Class.forName(myDriver);
			conn = DriverManager.getConnection(DBurl, username, password);
			return conn;
		}

		catch (Exception e) {
			System.out.println("Exception was found" + e.getMessage());
			return conn;
		}
	}

	public ResultSet select(String stmt) {
		String s = stmt;
		try {
			Connection c = connection();
			Statement query = c.createStatement();

			ResultSet r = query.executeQuery(s);
			return r;
		} catch (Exception e) {
			System.out.println("Database connection failed" + e.getMessage());
			return null;
		}

	}
}
