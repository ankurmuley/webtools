<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Controller" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="username" value="admin"/> </td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="pass"/> </td>
			</tr>
			<tr>
				<td rowspan="2" align="center">
						<button type="submit" name ="action" value="Login"> Login </button>
				</td>
			</tr>
		</table>
		<a href="registration.htm">New user?Register!</a>
	</form>
</body>
</html>