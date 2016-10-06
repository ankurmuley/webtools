<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.Pojo"%>
<%Pojo p5= (Pojo) request.getAttribute("p");%>
<h4>Location</h4><br>
Address:<br>
<p><% out.println(p5.getAddress()); %></p><br> 
