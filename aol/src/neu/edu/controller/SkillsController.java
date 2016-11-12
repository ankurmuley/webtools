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
 * Servlet implementation class SkillsController
 */
@WebServlet("/SkillsController")
public class SkillsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		String skill1 = request.getParameter("Skill1");
		String rateskill1 =request.getParameter("RateSkill1");
		String skill2 = request.getParameter("Skill2");
		String rateskill2 =request.getParameter("RateSkill2");
		String skill3 =request.getParameter("Skill3");
		String rateskill3 = request.getParameter("RateSkill3");
		
		
		uDao.updateResumeRecord6(skill1, rateskill1,skill2,rateskill2, skill3, rateskill3, username);
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

}
