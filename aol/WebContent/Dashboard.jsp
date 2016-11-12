    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" align="center">
		<tr>
			<td><h2>Welcome ${user.name}</h2></td>
			<td><a href="<%=response.encodeURL("LogoutController?action=Logout")%>">Logout</a></td>
		</tr>
	</table>
	
	<form action="<%=response.encodeUrl("MainController") %>" method="post">
	
	<%--button type="submit" name="action" value="Update"=>Update Existing</button--%>
	
	<c:choose>
  <c:when test='${user.linesaboutyou == null}'>
   <button type="submit" name="action" value="StartNew" >Create New Resume</button>
 </c:when>
  
  <c:otherwise>
    <button type="submit" name="action" value="View" >View Existing</button>
  </c:otherwise>
</c:choose>
	     
	</form>
</body>
</html>