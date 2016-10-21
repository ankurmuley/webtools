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
<h4>Education</h4>
University:<br>
<input type = "text" name="University" required><br>
Relevant Courses:<br>
<textArea name ="RelevantCourses" rows="3" col="20" required></textArea><br>
<button name="action" value ="EducationNext" type="submit">Next</button>
</form>
</body>
</html>