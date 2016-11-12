<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		String loginError = (String) request.getAttribute("login-error");
		if (loginError != null) {
			if ("username-password-mismatch".equals(loginError)) {
	%>
	<div>
		<h4>UserName and Password Mismatch !!</h4>
	</div>
	<%
		} else if ("session-invalid".equals(loginError)) {
	%>
	<div>
		<h4>Invalid Session !!</h4>
	</div>
	<%
		}
		}
	%>

	<form action="<%=response.encodeUrl("MainController") %>" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="username" value="sid"/> </td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="sid"/> </td>
			</tr>
			<tr>
				<td rowspan="2" align="center">
						<input name="action" type="submit" value="Login"/>
				</td>
			</tr>
			<tr>
        		  <td>
			        <a href="Register.jsp">New user?Register!</a>
			     </td>
			</tr>
		</table>
			
		</form>
</body>
</html>