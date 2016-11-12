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
 * Servlet implementation class RefrencesController
 */
@WebServlet("/RefrencesController")
public class RefrencesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefrencesController() {
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
		String ref1 = request.getParameter("Reference1");
		String ref1mail =request.getParameter("Reference1Email");
		String ref1rel =request.getParameter("Reference1Relation");
		String ref2 = request.getParameter("Reference2");
		String ref2mail =request.getParameter("Reference2Email");
		String ref2rel = request.getParameter("Reference2Relation");
		
		
		uDao.updateResumeRecord5(ref1, ref1mail,ref1rel,ref2, ref2mail, ref2rel, username);
		request.getRequestDispatcher("Skills.jsp").forward(request, response);
	}

}
