package Com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//       HttpSession session = request.getSession(false);
//		if(session ==null){
//			request.getRequestDispatcher("/LoginServlet").forward(request, response);
//		}
//		else{
//			request.getRequestDispatcher("/Dashboard.jsp").forward(request, response);
//		}

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		String abc =request.getParameter("action");
		if(abc.equals("Login")){
		request.getRequestDispatcher("LoginServlet").forward(request, response);	
		}
		if(abc.equals("Dashboardinput")){
			request.getRequestDispatcher("/AboutMe.jsp").forward(request, response);	
			}
		
		if(abc.equals("AboutNext")){
			request.getRequestDispatcher("AboutMeServlet").forward(request, response);	
			}
		
		if(abc.equals("EducationNext")){
			request.getRequestDispatcher("EducationServlet").forward(request, response);	
			}
		
		if(abc.equals("SkillsNext")){
			request.getRequestDispatcher("SkillsServlet").forward(request, response);	
			}
	}

}
