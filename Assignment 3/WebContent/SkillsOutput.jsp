<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Pojo"%>
<%Pojo p6= (Pojo) request.getAttribute("p");%>
<h4>Skills</h4>
1):<% out.println(p6.getSkill1()); %><br> 
  Rate your skill:<% out.println(p6.getRateSkill1()); %></br>
2):<% out.println(p6.getSkill2()); %><br>
 Rate your skill:<% out.println(p6.getRateSkill2()); %></br>
3):<% out.println(p6.getSkill3()); %><br>
 Rate your skill:<% out.println(p6.getRateSkill3()); %></br>