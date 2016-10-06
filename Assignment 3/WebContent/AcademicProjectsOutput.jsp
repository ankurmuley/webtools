<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Pojo"%>
<%Pojo p2= (Pojo) request.getAttribute("p");%>
Project 1:<br>
<p><% out.println(p2.getProject1Name()); %></p><br>
Project 1 Description:<br>
<p><% out.println(p2.getProject1Description()); %></p><br>
Project 2:<br>
<p><% out.println(p2.getProject2Name()); %></p><br>
Project 2 Description:<br>
<p><% out.println(p2.getProject2Description()); %></p><br>