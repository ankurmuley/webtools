package Com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pojo;

/**
 * Servlet implementation class SkillsServlet
 */
@WebServlet("/SkillsServlet")
public class SkillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(false);
		if(session==null){
			request.getRequestDispatcher("/Controller").forward(request, response);
			
		}else{
			Pojo p2 =  (Pojo) request.getSession().getAttribute("p") ;
		    p2.setSkill1(request.getParameter("Skill1"));
		    p2.setSkill2(request.getParameter("Skill2"));
		    p2.setSkill3(request.getParameter("Skill3"));
			p2.setRateSkill1(request.getParameter("rateSkill1"));
			p2.setRateSkill2(request.getParameter("rateSkill2"));
			p2.setRateSkill3(request.getParameter("rateskill3"));

			request.getSession().setAttribute("p2", p2);
			request.getRequestDispatcher("/Output.jsp").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
