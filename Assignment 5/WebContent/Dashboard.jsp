<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="model.User"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Controller" method="post">
			<div align="right"><a href="<%=response.encodeURL("Logout")%>" >Logout</a></div>
<h1>hello ${user.name} </h1>
<button name="action" value ="Dashboardinput" type="submit">Start Input to Create your Resume</button>
</form>
</body>
</html>