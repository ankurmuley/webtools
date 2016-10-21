<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="model.Pojo"%>
  <%@page import="Com.EducationServlet"%>
<%Pojo p2= (Pojo) request.getSession().getAttribute("p1");%>
<h4>Education</h4>
University:<br/>
<p><% out.println(p2.getUniversity()); %></p><br/>
Relevant Courses:<br>
<p><% out.println(p2.getRelevantCourses()); %></p></textArea><br/>