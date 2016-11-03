<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=response.encodeUrl("RegisterController") %>" method="post">
 Full Name:<br>
  <input type="text" name="name" required><br>
 DOB:<br>
  <input type="text" name="dob" required><br>
 Gender:<br>
  <input type="text" name="gender" required><br>
 UserName:<br>
  <input type="text" name="username" required><br>  
 Password:<br>
  <input type="password" name="password" required><br>  
 <button type="Submit" name="action" value="Register">Submit</button>
</form>
</body>
</html>