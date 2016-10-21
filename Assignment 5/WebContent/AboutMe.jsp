<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="Controller" method ="post">
		<div align="right"><a href="<%=response.encodeURL("Logout")%>" >Logout</a></div>
<h4>About You</h4>
Full Name:<br>
<input type="text" name="Name" required><br>
Email Address:<br>
<input type="text" name="EmailAddress" required><br>
Phone Number:<br>
<input type="text" name="PhoneNumber" required><br>
Describe about you:<br>
<textArea name ="aboutyou" rows="3" col="20" required>  </textArea><br>
<button name="action" value ="AboutNext" type="submit">Next</button>
</form>
</body>
</html>