package neu.edu.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import neu.edu.dao.UserAccountDAO;
import neu.edu.model.UserRegistration;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet(urlPatterns = { "/RegisterController"}, 
initParams = { 
		@WebInitParam(name = "SUCCESS", value = "Login.jsp"), 
		@WebInitParam(name = "FAIL", value ="Register.jsp" )
})
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		String nameparam = request.getParameter("name");
		String dobparam=request.getParameter("dob");
		String genderParam = request.getParameter("gender");
		String nextPage = "FAIL";

		System.out.println("0");
			
			if(userParam==null || passwordParam == null||nameparam==null||dobparam==null||genderParam==null){
				nextPage = "FAIL";
				request.setAttribute("register-error", "Fields-empty");

			}else{
				
			UserAccountDAO userAccountDAO = new UserAccountDAO();
			System.out.println("1");
			UserRegistration user = userAccountDAO.insertRecord(userParam, passwordParam,nameparam,dobparam,genderParam);
			System.out.println("2");
//			String url = getServletConfig().getInitParameter(nextPage);
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.forward(request, response);
			}
	}

}
