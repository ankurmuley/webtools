package neu.edu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import neu.edu.dao.UserAccountDAO;
import neu.edu.model.UserRegistration;

/**
 * Servlet implementation class AboutMeController
 */
@WebServlet("/AboutMeController")
public class ResumeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("AboutMe.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserAccountDAO uDao = new UserAccountDAO();
		HttpSession session = request.getSession();
		UserRegistration usr =(UserRegistration)session.getAttribute("user");
		String username=usr.getUserName();
		String emailAdd = request.getParameter("EmailAddress");
		String phn =request.getParameter("PhoneNumber");
		String abtme =request.getParameter("aboutyou");
		
		uDao.updateResumeRecord(emailAdd, phn, abtme, username);
		
	}

}
