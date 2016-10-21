package Com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserDtails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		value = "/LoginServlet", 
		initParams = { 
				@WebInitParam(name = "SUCCESS", value = "Dashboard.jsp"), 
				@WebInitParam(name = "FAILURE", value = "LoginForm.jsp")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/LoginForm.jsp").forward(request, response);
		request.getSession().invalidate();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String userParam = request.getParameter("username");
		String passwordParam = request.getParameter("password");
		boolean isLogin = false;
		HttpSession session = request.getSession();
		

		
//		UserDtails udet=(UserDtails)session.getAttribute("ud");
//		System.out.println(udet.getPassword());
//		System.out.println(udet.getUsername());
//		
		if ("pass".equals(passwordParam)) {
			isLogin = true;
		}

		
		String nextPage = "SUCCESS";
		if (!isLogin) {
			nextPage = "FAILURE";
			request.setAttribute("login-error", "username-password-mismatch");
		
		} else {
			
			User user =new User();
			user.setName(userParam);
			user.setSessionIDVariable(session.getId());
			user.setActive(true);
			session.setAttribute("user", user);
			
		}
		
		String url = getServletConfig().getInitParameter(nextPage);
		response.sendRedirect(response.encodeRedirectURL(url));
	}

}
