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
	<div align="right"><a href="<%=response.encodeURL("Logout")%>" >Logout</a></div>
<h4>Skills</h4>
1):<input type = "text" name="Skill1" required><br> 
  Rate your skill:<input type="range" name="rateSkill1" min="0" max="10"></br>
2):<input type = "text" name="Skill2" required><br>
 Rate your skill:
  <input type="range" name="rateSkill2" min="0" max="10"></br>
3):<input type = "text" name="Skill3" required><br>
 Rate your skill:
  <input type="range" name="rateskill3" min="0" max="10"></br>
<button name="action" value ="SkillsNext" type="submit">Next</button>
</form>
</body>
</html>