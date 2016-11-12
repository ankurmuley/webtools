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
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
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
		
		String username=(String)session.getAttribute("name");
		String emailAdd = request.getParameter("EmailAddress");
		String phn =request.getParameter("PhoneNumber");
		String abtme =request.getParameter("aboutyou");
		String addr = request.getParameter("Address");
		String univ = request.getParameter("University");
		String relvcours =request.getParameter("RelevantCourses");
		String proj1 = request.getParameter("Project1Name");
		String proj1desc =request.getParameter("Project1Description");
		String proj2 = request.getParameter("Project2Name");
		String proj2desc =request.getParameter("Project2Description");
		String comp = request.getParameter("Company");
		String posn =request.getParameter("Position");
		String jobdesc =request.getParameter("JobDescription");
		String ref1 = request.getParameter("Reference1");
		String ref1mail =request.getParameter("Reference1Email");
		String ref1rel =request.getParameter("Reference1Relation");
		String ref2 = request.getParameter("Reference2");
		String ref2mail =request.getParameter("Reference2Email");
		String ref2rel = request.getParameter("Reference2Relation");
		String skill1 = request.getParameter("Skill1");
		String rateskill1 =request.getParameter("RateSkill1");
		String skill2 = request.getParameter("Skill2");
		String rateskill2 =request.getParameter("RateSkill2");
		String skill3 =request.getParameter("Skill3");
		String rateskill3 = request.getParameter("RateSkill3");
		UserRegistration user= uDao.updateCV(emailAdd, phn,abtme,addr,univ, relvcours, proj1,proj1desc, proj2,proj2desc,comp, posn,jobdesc,ref1, ref1mail,ref1rel,ref2, ref2mail, ref2rel,skill1, rateskill1,skill2,rateskill2, skill3, rateskill3,username);
		request.setAttribute("user", user);
		request.getRequestDispatcher("ViewResume.jsp").forward(request, response);
		
	}

}
