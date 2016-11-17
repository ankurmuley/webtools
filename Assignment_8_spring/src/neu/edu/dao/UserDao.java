package neu.edu.dao;

import java.util.Date;
import java.util.List;

import neu.edu.entity.UserAccount;

public interface UserDao {
	UserAccount validateUser(String username,String password);
	boolean createUser(UserAccount userAccount);
	boolean deleteUser(UserAccount userAccount);
	boolean updateUser(UserAccount userAccount);
	List<UserAccount> listUser();
	UserAccount validateUserSQL(String username, String password);

}
