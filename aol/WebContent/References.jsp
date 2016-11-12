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
<h4>References</h4>
Reference 1:<br>
<input type="text" name ="Reference1"><br> 
Reference 1 Email:<br>
<input type="text" name ="Reference1Email" ><br> 
Reference 1 Relation:<br>
<input type="text" name ="Reference1Relation" ><br> 
Reference 2:<br>
<input type="text" name ="Reference2" ><br> 
Reference 2 Email:<br>
<input type="text" name ="Reference2Email" ><br> 
Reference 2 Relation:<br>
<input type="text" name ="Reference2Relation" ><br> 
<table><tr><td>
<button name="action" value ="ReferencesBack" type="submit">Previous</button>
</td><td>
<button name="action" type="submit" value="SaveReferences">Next</button>
</td>
</tr>
</table>
</form>
</body>
</html>