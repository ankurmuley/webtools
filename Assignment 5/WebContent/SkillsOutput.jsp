<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="model.Pojo"%>
   <%@page import="Com.SkillsServlet"%>
<%Pojo p3= (Pojo) request.getSession().getAttribute("p2");%>
<h4>Skills</h4>
1):<% out.println(p3.getSkill1()); %><br> 
  Rate your skill:<% out.println(p3.getRateSkill1()); %></br>
2):<% out.println(p3.getSkill2()); %><br>
 Rate your skill:<% out.println(p3.getRateSkill2()); %></br>
3):<% out.println(p3.getSkill3()); %><br>
 Rate your skill:<% out.println(p3.getRateSkill3()); %></br>