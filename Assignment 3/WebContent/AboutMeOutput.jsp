<%@page import="com.Pojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%Pojo p1= (Pojo) request.getAttribute("p");%>
<h4>About You</h4>
Full Name:<br>
<p><% out.println(p1.getName()); %></p><br>
Email Address:<br>
<p><% out.println(p1.getEmailAddress()); %></p><br>
Phone Number:<br>
<p><% out.println(p1.getEmailAddress()); %></p>
Describe about you:<br>
<p><% out.println(p1.getAboutyou()); %></p>  </textArea><br>
