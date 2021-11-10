import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produto {
	// STEP 1. Import required packages

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/trabalho_de_bd?useTimezone=true&serverTimezone=UTC";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "tricolor26";

	public static void InsereProduto(String var1, int quant, float preco) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();

			String sql = "INSERT INTO Produto (Nome_Produto, Quantidade, Preco) " + "VALUES ('" + var1 + "','" + quant
					+ "','" + preco + "')";
			System.out.println(sql);
			stmt.executeUpdate(sql);

			System.out.println("Inserted records into the table...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

	public static void DeletaProduto(String var1) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Deleting records from the table...");
			stmt = conn.createStatement();

			String sql = "DELETE From Produto WHERE " + "(Nome_Produto = \"" + var1 + "\")";
			System.out.println(sql);
			stmt.executeUpdate(sql);

			System.out.println("Delete sucessfull...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

	public static boolean ChecaProduto(String var1) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			boolean e = false;
			ResultSet rs;
			try {
				String SQL = "SELECT EXISTS(SELECT 1 FROM Produto WHERE Nome_Produto = \"" + var1 + "\")";
				System.out.println(SQL);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL);
				// System.out.println(rs);
				int n = 0;
				if (rs.next()) {
					n = rs.getInt(1);
				}
				if (n > 0) {
					return true;
				} else
					return false;
			} catch (SQLException l) {
				l.printStackTrace();
			}
			System.out.println("Check sucessfull...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		return false;
	}// end main

	public static void AlteraProduto(String var1, String var3, int quant, float preco) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Updating records into the table...");
			stmt = conn.createStatement();

			String sql = "UPDATE Produto SET Nome_Produto ='" + var1 + "', Quantidade ='" + quant + "' " + ", Preco ='"
					+ preco + "' " + "WHERE Nome_Produto = '" + var3 + "'";
			System.out.println(sql);
			stmt.executeUpdate(sql);

			System.out.println("Updated records into the table...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end JDBCExample
