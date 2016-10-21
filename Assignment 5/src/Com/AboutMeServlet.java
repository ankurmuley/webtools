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
 * Servlet implementation class AboutMeServlet
 */
@WebServlet("/AboutMeServlet")
public class AboutMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMeServlet() {
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
		Pojo p =new Pojo();
		p.setName(request.getParameter("Name"));
		p.setEmailAddress(request.getParameter("EmailAddress"));
		p.setPhoneNumber(request.getParameter("PhoneNumber"));
		p.setAboutyou(request.getParameter("aboutyou"));
		request.getRequestDispatcher("/Education.jsp").forward(request, response);
		session.setAttribute("p", p);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
