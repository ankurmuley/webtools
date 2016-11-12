package neu.edu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainController
 */
@WebServlet(
		urlPatterns = { "/MainController" }
	
		)
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
		
		
		
    public MainController() {
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
		
		String abc =request.getParameter("action");
		if(abc.equals("Login")){
		request.getRequestDispatcher("LoginController").forward(request, response);	
		}
		else if(abc.equals("Register")){
		request.getRequestDispatcher("RegisterController").forward(request, response);	
		}
		else if(abc.equals("Dashboard")){
		request.getRequestDispatcher("DashboardController").forward(request, response);	
		}
		else if(abc.equals("StartNew")){
			request.getRequestDispatcher("ResumeController").forward(request, response);	
		}
		else if(abc.equals("UpdateExisting")){
			
			request.getRequestDispatcher("UpdateController").forward(request, response);	
		}
		else if(abc.equals("SaveAboutMe")){
			
			request.getRequestDispatcher("AboutMeController").forward(request, response);	
		}
        else if(abc.equals("SaveLocation")){
			
			request.getRequestDispatcher("LocationController").forward(request, response);	
		}
        else if(abc.equals("SaveEducation")){
			
			request.getRequestDispatcher("EducationController").forward(request,response);
		}
        else if(abc.equals("SaveAcademicProjects")){
		
		    request.getRequestDispatcher("AcdemicProjectsController").forward(request,response);
	    }	
        else if(abc.equals("SaveExperience")){
		
		    request.getRequestDispatcher("ExperienceController").forward(request,response);
	    }
        else if(abc.equals("SaveReferences")){
		
		    request.getRequestDispatcher("RefrencesController").forward(request,response);
	    }	
        else if(abc.equals("SaveSkills")){
		
		    request.getRequestDispatcher("SkillsController").forward(request,response);
		    
	    }
        else if(abc.equals("View")){
    		
		    request.getRequestDispatcher("ViewController").forward(request,response);
		      
	    }
        else if(abc.equals("AboutMeBack")){
    		
		    request.getRequestDispatcher("DashboardController").forward(request,response);
		        
	    }
        else if(abc.equals("LocationBack")){
    		
		    request.getRequestDispatcher("AboutMe.jsp").forward(request,response);
		      
	    }
        else if(abc.equals("EducationBack")){
		
	    request.getRequestDispatcher("Location.jsp").forward(request,response);
	      
        }
        else if(abc.equals("AcademicProjectsBack")){
		
	    request.getRequestDispatcher("Education.jsp").forward(request,response);
	      
        }else if(abc.equals("ExperienceBack")){
		
	    request.getRequestDispatcher("AcademicProjects.jsp").forward(request,response);
	      
        } else if(abc.equals("ReferencesBack")){
		
	    request.getRequestDispatcher("Experience.jsp").forward(request,response);
	      
       } else if(abc.equals("SkillsBack")){
		
	    request.getRequestDispatcher("References.jsp").forward(request,response);
	      
}
 
	}   
}
