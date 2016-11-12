package neu.edu.dao;

import java.util.Date;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import neu.edu.entity.UserRegistration;

public interface UserDao {
	UserRegistration validateUser(String username,String password);
	boolean createUser(UserRegistration userAccount);
	boolean deleteUser(UserRegistration userAccount);
	boolean updateUser(UserRegistration userAccount);
	List<UserRegistration> listUser();
	UserRegistration validateUserSQL(String username, String password);

}
