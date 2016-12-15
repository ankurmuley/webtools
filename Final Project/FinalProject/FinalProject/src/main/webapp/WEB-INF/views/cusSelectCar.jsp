<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Cars</title>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

<link href="resources/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>

<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#">Car Rental</a></h1>
			<span>By <a href="http://templated.co">TEMPLATED</a></span> </div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="customerhome.htm" accesskey="1" title="">Homepage</a></li>
				<li><a href="reservationPage.htm" accesskey="2" title="">Reservation</a></li>
				<li><a href="logout.htm" accesskey="4" title="">LogOut</a></li>
				<li><a href="viewOrder.htm" accesskey="5" title="">My Order</a></li>
			</ul>
		</div>
	</div>
</div>
     <div class="container">
      
    
    <div class="jumbotron">
   
    
  <h3> Welcome  ${username.username}</h3>
  
		<form action="selectCar.htm" method="post">
		<table>

		<tr>
		<td>Car Name</td>
		<td><input type="text" name="carName" value="${car.carName }" required /></td>
		<td><br/></td>
		</tr>
		<tr>
		<td>Car Type</td>
		<td><input type="text" name="carType" value="${car.carType }" required/></td>
		<td><br/></td>
		</tr>
		<tr>
		<td>Rate</td>
		<td><input type="text" name="rate" value="${car.rate }"required /></td>
		<td><br/></td>
		</tr>
		<tr>
		<td>Transmission type</td>
		<td><input type="text" name="transmission" value="${car.transmission }" required/></td>
		<td><br/></td>
		</tr>

		<tr>
		<td><input type="hidden" name="id" value="${car.id }"></td>
		</tr>
		<tr>
        <td><input type="hidden" name="action" value="checkout"></td>
		</tr>
		<tr>
		<td><input type="submit" value="CheckOut"></td>
		</tr>
		</table>
</div>

</div>

</body>
</html>