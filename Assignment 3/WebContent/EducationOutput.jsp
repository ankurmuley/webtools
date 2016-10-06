<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.Pojo"%>
<%Pojo p3= (Pojo) request.getAttribute("p");%>
<h4>Education</h4>
University:<br/>
<p><% out.println(p3.getUniversity()); %></p><br/>
Relevant Courses:<br>
<p><% out.println(p3.getRelevantCourses()); %></p></textArea><br/>