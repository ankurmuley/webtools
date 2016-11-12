<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MainController" method="post">
	<div align="right"><a href="<%=response.encodeURL("LogoutController?action=Logout")%>" >Logout</a></div>
<h4>Skills</h4>
1):<input type = "text" name="Skill1" ><br> 
  Rate your skill:<input type="range" name="RateSkill1" min="0" max="10"></br>
2):<input type = "text" name="Skill2" ><br>
 Rate your skill:
  <input type="range" name="RateSkill2" min="0" max="10"></br>
3):<input type = "text" name="Skill3" ><br>
 Rate your skill:
  <input type="range" name="Rateskill3" min="0" max="10"></br>
  
<table><tr><td>
<button name="action" value ="SkillsBack" type="submit">Previous</button>
</td><td>
<button type="Submit" name="action" value="SaveSkills">Submit</button>
</td>
</tr>
</table>
</form>
</body>
</html>