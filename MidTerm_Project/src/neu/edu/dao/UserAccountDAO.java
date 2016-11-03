package neu.edu.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import neu.edu.database.JDBCConnectivity;
import neu.edu.model.UserRegistration;

 

public class UserAccountDAO {
	private Connection conn;

	public UserAccountDAO(){
    conn = JDBCConnectivity.getConnection();  
	}
	
public UserRegistration validateLogin(String username,String password){
	UserRegistration user= null;
	String sql ="select USER_NAME "
			+ "	from users "
			+ " where USER_NAME=? "
			+ " and PASSWORD=password(?) ";
	System.out.println("Query :"+sql);
	try {
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, password);
		
		ResultSet rs = pst.executeQuery();
		
	//	if(rs.getFetchSize()==1){
			
			user = new  UserRegistration();
			while(rs.next()){
				
				user.setName(rs.getString(1));
			}
		//}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return user;
}

public UserRegistration insertRecord(String username, String password, String name, String dob,String gender){

	
	UserRegistration user= null;
	String insertSql = "insert into users values(?,?,?,?,?)";
	try {
	PreparedStatement pst = conn.prepareStatement(insertSql);
	pst.setString(1, username);
	pst.setString(2, password);
	pst.setString(3, name);
	Calendar gc = GregorianCalendar.getInstance();
	java.sql.Date sqlDate = new Date(gc.getTimeInMillis());
	pst.setString(4, dob);
	pst.setString(5, gender);
	int execUpdate = pst.executeUpdate();

	System.out.println("Execute Update " + execUpdate);
	
//   ResultSet rs;
//
//	user = new UserRegistration();
//	while (rs.next()) {
//		user.setDob(rs.getString("AGE"));
//		user.setName(rs.getString("NAME"));
//		user.setUserName(rs.getString("USER_NAME"));
//		user.setGender(rs.getString("gender"));
//		System.out.println(user.toString());

//	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}
	
	return user;
}	
//public ArrayList<Users> listAllUsers(){
//	ArrayList<User> users = new ArrayList<>();
//	Statement st = null;
//	ResultSet rs = null;
//	try {
//		st = conn.createStatement();
//
//		String sql = "select * from user_account";
//
//		rs = st.executeQuery(sql);
//
//		
//		while (rs.next()) {
//			UserRegistration user = new UserRegistration();
//			user.setDob(rs.getDate("AGE"));
//			user.setName(rs.getString("NAME"));
//			user.setUserName(rs.getString("USER_NAME"));
//			user.setGender(rs.getString("gender"));
//			System.out.println(user.toString());
//			users.add(user);
//
//		}
//
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} finally {
//		try {
//			rs.close();
//			st.close();
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	return users;
//}

public UserRegistration updateResumeRecord(String email, String phn, String abtme,String username){
	UserRegistration user= null;
	String insertSql = "update users  set emailaddress = ? ,phonenumber=?,linesaboutyou=? where USER_NAME=?";
	try {
	PreparedStatement pst = conn.prepareStatement(insertSql);
	pst.setString(1, email);
	pst.setString(2, phn);
	pst.setString(3, abtme);
	pst.setString(4, username);
	int execUpdate = pst.executeUpdate();

	System.out.println("Execute Update " + execUpdate);
}
 catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}
	
	return user;
	}
}
