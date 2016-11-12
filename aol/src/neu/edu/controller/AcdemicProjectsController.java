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
import neu.edu.model.UserSession;

/**
 * Servlet implementation class AcdemicProjectsController
 */
@WebServlet("/AcdemicProjectsController")
public class AcdemicProjectsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcdemicProjectsController() {
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
		UserAccountDAO uDao = new UserAccountDAO();
		HttpSession session = request.getSession();
		UserSession usr =(UserSession)session.getAttribute("usersession");
		String username=usr.getName();
		String proj1 = request.getParameter("Project1Name");
		String proj1desc =request.getParameter("Project1Description");
		String proj2 = request.getParameter("Project2Name");
		String proj2desc =request.getParameter("Project2Description");
		
		uDao.updateResumeRecord3(proj1,proj1desc, proj2,proj2desc , username);
		request.getRequestDispatcher("Experience.jsp").forward(request, response);
	}

}
