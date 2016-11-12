<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=response.encodeUrl("MainController") %>" method="post">
<div align="right"><a href="<%=response.encodeURL("LogoutController?action=Logout")%>" >Logout</a></div>
<h4>Location</h4><br>
Address:<br>
<textarea name ="Address" ></textarea><br> 
<table><tr><td>
<button name="action" value ="LocationBack" type="submit">Previous</button>
</td><td>
<button name="action" type="submit" value="SaveLocation">Next</button>
</td></tr></table>
</form>
</body>
</html>