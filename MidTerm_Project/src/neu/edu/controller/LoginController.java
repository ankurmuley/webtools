package neu.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import neu.edu.dao.UserAccountDAO;
import neu.edu.model.UserRegistration;
import neu.edu.model.UserSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(
		urlPatterns = { "/LoginController" }, 
		initParams = { 
				@WebInitParam(name = "SUCCESS", value = "DashboardController"), 
				@WebInitParam(name = "FAIL", value = "Login.jsp")
		})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		String userParam = request.getParameter("username");
		String passwordParam = request.getParameter("password");
		String nextPage = "FAIL";

		

		 if(userParam==null || passwordParam == null){
			nextPage = "FAIL";
			request.setAttribute("login-error", "username-password-empty");

		} else {

			UserAccountDAO userAccountDAO = new UserAccountDAO();
			UserRegistration user = userAccountDAO.validateLogin(userParam, passwordParam);
			UserSession userSession= null;

			if(user !=null){
				nextPage = "SUCCESS";
				HttpSession session = request.getSession();
				userSession = new UserSession();

				userSession.setName(userParam);
				userSession.setSessionId(session.getId());
				userSession.setActive(true);

				session.setAttribute("usersession", userSession);
				session.setAttribute("user", user);
			}
			
//			ArrayList<User> users = userAccountDAO.listAllUsers();
//			UserSession userSession= null;
//			for (User user : users) {
//				if (user.getName().equals(passwordParam)) {
//					nextPage = "SUCCESS";
//
//					HttpSession session = request.getSession();
//					userSession = new UserSession();
//
//					userSession.setName(userParam);
//					userSession.setSessionId(session.getId());
//					userSession.setActive(true);
//
//					session.setAttribute("user", userSession);
//				} 
//			}
			
			if(userSession==null){

					nextPage = "FAIL";
					request.setAttribute("login-error", "username-password-mismatch");
			}
		}
		
		String url = getServletConfig().getInitParameter(nextPage);
		RequestDispatcher rd = request.getRequestDispatcher("/" + url);
		rd.forward(request, response);

		// response.sendRedirect(response.encodeRedirectURL(url));
	}



}
