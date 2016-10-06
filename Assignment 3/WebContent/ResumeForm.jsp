<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ConvertingJSP" method ="post"> 
<%@ include file ="/AboutMe.jsp" %>
<%@ include file="/Location.jsp" %>
<%@ include file ="/Education.jsp" %>
<%@ include file="/Experience.jsp" %>
<%@ include file ="/AcademicProjects.jsp" %>
<%@ include file="/Skills.jsp" %>
<input type ="submit" value="Submit">
</form>
</body>
</html>