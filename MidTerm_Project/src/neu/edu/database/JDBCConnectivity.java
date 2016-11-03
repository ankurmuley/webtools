package neu.edu.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

import neu.edu.model.UserRegistration;


public class JDBCConnectivity {
	private static Connection conn;

	private JDBCConnectivity() {

	}

	private static String hostName = "localhost";
	private static String dbName = "useraccountdb";
	private static String userName = "root";
	private static String password = "@Shobhitchepe8";

	public static Connection getConnection() {

		try {
			if (conn == null || conn.isClosed()) {
				// Step 1: Register Driver
				try {
					Class.forName("com.mysql.jdbc.Driver");

					// Step 2: Create connectivity URL
					String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
					// Step 3: Open Connection
					conn = DriverManager.getConnection(connectionURL, userName, password);

					// Step 4: Handle Error
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Driver Not Found");
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Connectivity Issue");
					e.printStackTrace();
				}
				System.out.println("Created Connection");

			} else {
				System.out.println("Reusing Connection");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection not handled");
		}
		
		return conn;
	}
public static void main(String[] arg) {
		
		Connection conn = getConnection();
		if (conn != null) {
			System.out.println("DONE");
		}

		Statement st = null;
		ResultSet rs = null;
		try {
			st = conn.createStatement();

			String sql = "select * from user_account";

			rs = st.executeQuery(sql);

			UserRegistration user = new UserRegistration();
			while (rs.next()) {
				user.setDob(rs.getString("AGE"));
				user.setName(rs.getString("NAME"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setGender(rs.getString("gender"));
				System.out.println(user.toString());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		PreparedStatement pst = null;

		try {
			conn = getConnection();
			String sql = "select * from user_account where password=password(?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, "test1");

			rs = pst.executeQuery();

			if (rs.getFetchSize() == 0) {
				System.out.println("NO USER");
			}
			UserRegistration user = new UserRegistration();
			while (rs.next()) {
				user.setDob(rs.getString("AGE"));
				user.setName(rs.getString("NAME"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setGender(rs.getString("gender"));
				System.out.println(user.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			conn = getConnection();
			String insertSql = "insert into user_account values(?,?,password(?),?)";
			pst = conn.prepareStatement(insertSql);
			pst.setString(1, "username");
			pst.setString(2, "name");
			pst.setString(3, "test");
			Calendar gc = GregorianCalendar.getInstance();
			java.sql.Date sqlDate = new Date(gc.getTimeInMillis());
			pst.setDate(4, sqlDate);
			pst.setString(5, "test");
			int execUpdate = pst.executeUpdate();

			System.out.println("Exectue Update " + execUpdate);
			
			String selectSql = "select * from user_account";
			st = conn.createStatement();
			rs = st.executeQuery(selectSql);

			UserRegistration user = new UserRegistration();
			while (rs.next()) {
				user.setDob(rs.getString("AGE"));
				user.setName(rs.getString("NAME"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setGender(rs.getString("gender"));
				System.out.println(user.toString());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			conn = getConnection();
			String sql = "delete from user_account where user_name=? and password=password(?) ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, "username");
			pst.setString(2, "test");

			int execUpdate = pst.executeUpdate();

			System.out.println("Exectue Update " + execUpdate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
