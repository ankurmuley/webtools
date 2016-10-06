<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.Pojo"%>
<%Pojo p4= (Pojo) request.getAttribute("p");%>
<h4>Experience</h4>
Company:<br>
<p><% out.println(p4.getCompany()); %></p><br>
JobPositon:<br>
<p><% out.println(p4.getPosition()); %></p><br>
Job Description:<br>
<p><% out.println(p4.getJobDescription()); %></p><br>