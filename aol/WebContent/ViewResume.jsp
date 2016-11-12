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
<h4>About You</h4>
Email Address:<br>
<input type="text" name="EmailAddress" value=${user.emailAddress} ><br>
Phone Number:<br>
<input type="text" name="PhoneNumber" value=${user.phoneNumber}><br>
Describe about you:<br>
<input type="text" name ="aboutyou" rows="3" col="20" value=${user.linesaboutyou}> <br>
<h4>Location</h4><br>
Address:<br>
<input type="text" name ="Address" value=${user.address} ><br> 
<h4>Education</h4>
University:<br>
<input type = "text" name="University"  value=${user.university}><br>
Relevant Courses:<br>
<input type="text" name ="RelevantCourses" rows="3" col="20" value=${user.relevantCourses}><br>
<h4>Academic Projects</h4><br>
Project 1:<br>
<input type ="text" name ="Project1Name" value=${user.project1Name}><br>
Project 1 Description:<br>
<input type="text" name ="Project1Description"rows="3" col="20" value=${user.project1Description}><br>
Project 2:<br>
<input type ="text" name="Project2Name" value=${user.project2Name}><br>
Project 2 Description:<br>
<input type="text" name ="Project2Description"rows="3" col="20" value=${user.project2Description}><br>
<h4>Experience</h4>
Company:<br>
<input type = "text" name="Company" value=${user.company}><br>
JobPositon:<br>
<input type = "text" name="Position" value=${user.position}><br>
Job Description:<br>
<input type="text" name ="JobDescription" rows="3" col="20" value=${user.jobDescription}><br>
<h4>Skills</h4>
1):<input type = "text" name="Skill1" value=${user.skill1}><br> 
  Rate your skill:<input type="text" name="RateSkill1"  value=${user.rateSkill1}></br>
2):<input type = "text" name="Skill2" value=${user.skill2}><br>
 Rate your skill:
  <input type="text" name="RateSkill2"  value=${user.rateSkill2}></br>
3):<input type = "text" name="Skill3" value=${user.skill3}><br>
 Rate your skill:
  <input type="text" name="Rateskill3"  value=${user.rateSkill3}></br>
 <h4>References</h4>
Reference 1:<br>
<input type="text" name ="Reference1" value=${user.reference1Name}><br> 
Reference 1 Email:<br>
<input type="text" name ="Reference1Email" value=${user.reference1Email} ><br> 
Reference 1 Relation:<br>
<input type="text" name ="Reference1Relation" value=${user.reference1Relation}><br> 
Reference 2:<br>
<input type="text" name ="Reference2" value=${user.reference2Name}><br> 
Reference 2 Email:<br>
<input type="text" name ="Reference2Email" value=${user.reference2Email}><br> 
Reference 2 Relation:<br>
<input type="text" name ="Reference2Relation" value=${user.reference2Relation}><br> 
<table><tr><td>
<button name="action" value ="AboutMeBack" type="submit">Previous</button>
</td><td>
<button name="action" type="submit" value="UpdateExisting">Update</button>
</td></tr></table>
</form>
</body>
</html>