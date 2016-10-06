package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConvertingJSP
 */
public class ConvertingJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertingJSP() {
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
		//doGet(request, response);
		Pojo p = new Pojo();
		p.setName(request.getParameter("Name"));
		p.setEmailAddress(request.getParameter("EmailAddress"));
		p.setPhoneNumber(request.getParameter("PhoneNumber"));
		p.setAboutyou(request.getParameter("aboutyou"));
		p.setAddress(request.getParameter("Address"));
		p.setUniversity(request.getParameter("University"));
		p.setRelevantCourses(request.getParameter("RelevantCourses"));
		p.setCompany(request.getParameter("Company"));
		p.setPosition(request.getParameter("Position"));
		p.setJobDescription(request.getParameter("JobDescription"));
		p.setProject1Name(request.getParameter("Project1Name"));
	    p.setProject2Name(request.getParameter("Project2Name"));
	    p.setProject1Description(request.getParameter("Project1Description"));
	    p.setProject2Description(request.getParameter("Project2Description"));
	    p.setSkill1(request.getParameter("Skill1"));
	    p.setSkill2(request.getParameter("Skill2"));
	    p.setSkill3(request.getParameter("Skill3"));
		p.setRateSkill1(request.getParameter("rateSkill1"));
		p.setRateSkill2(request.getParameter("rateSkill2"));
		p.setRateSkill3(request.getParameter("rateskill3"));

		request.setAttribute("p", p);
		request.getRequestDispatcher("/ResumeOutput.jsp").forward(request, response);
	}

}
