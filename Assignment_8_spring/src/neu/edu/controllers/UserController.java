package neu.edu.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import neu.edu.dao.UserDao;
import neu.edu.dao.UserDaoImpl;
import neu.edu.entity.UserAccount;
import neu.edu.util.HibernateUtil;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	private UserDao userDao;
	
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		listUsers(userDao.listUser());
		//SimpleDateFormat sdf =new SimpleDateFormat(pattern, formatSymbols)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		UserAccount userAccount = null;
		
		System.out.println("======Validating user(invalid)======");
		userAccount = userDao.validateUser("admin", "test");

		if (userAccount != null) {
			System.out.println("Welcome User" + userAccount.getName());
		} else {
			System.out.println("User is invalid");
		}


		System.out.println("======Validating user======");
		userAccount = userDao.validateUserSQL("ashwin", "test");
		if (userAccount != null) {
			System.out.println("Welcome User " + userAccount.getName());
		} else {
			System.out.println("User is invalid");
		}
		
		System.out.println("======user in  BD ======");
		listUsers(userDao.listUser());

		
		System.out.println("======Start CRUD ======");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("======Creating user ======");

			userAccount = new UserAccount("ashwin1", "myName", "test", sdf.parse("01/01/1990"), null);
			boolean created = userDao.createUser(userAccount);
			if (created) {
				System.out.println("user created");
			} else {
				System.out.println("user creation failed");

			}

			listUsers(userDao.listUser());

			System.out.println("======Deleting user ======");

			boolean deleted = userDao.deleteUser(userAccount);
			if (deleted) {
				System.out.println("user deleted");
			} else {
				System.out.println("user deletion failed");

			}
			listUsers(userDao.listUser());
			System.out.println("======Creating user2 ======");

			userAccount = new UserAccount("ashwin2", "myName", "test", sdf.parse("01/01/1990"), null);
			boolean created2 = userDao.createUser(userAccount);
			if (created2) {
				System.out.println("user created");
			} else {
				System.out.println("user creation failed");

			}

			listUsers(userDao.listUser());
			System.out.println("======Updating user2 ======");

			userAccount.setName("ashwinupdate");
			boolean update = userDao.updateUser(userAccount);
			if (update) {
				System.out.println("user updated");
			} else {
				System.out.println("user creation failed");

			}

			listUsers(userDao.listUser());
			System.out.println("======Deleting user2 ======");

			boolean deleted2 = userDao.deleteUser(userAccount);
			if (deleted2) {
				System.out.println("user deleted");
			} else {
				System.out.println("user deletion failed");

			}
			listUsers(userDao.listUser());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void listUsers(List<UserAccount> userAccounts) {
		for (UserAccount userAccount : userAccounts) {
			if (userAccount != null) {
				System.out.println("[username="+userAccount.getUserName()+",name="+userAccount.getName()+"]");
			}
		}

	}

}
