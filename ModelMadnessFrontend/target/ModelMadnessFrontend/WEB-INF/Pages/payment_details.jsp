<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">


<title>ModelMadness</title>

<!-- Bootstrap core CSS -->

<!--Pulling Awesome Font -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<spring:url value="/resources/css/wired.css" var="style"/><link rel="stylesheet" href="${style}">
<spring:url value="/resources/css/home.css" var="style"/><link rel="stylesheet" href="${style}">
<spring:url value="/resources/css/HomePage.css" var="style"/><link rel="stylesheet" href="${style}">
   
</head>



<body style="background-color:#76D7C4;">
<%@include file="header.jsp"%>
	<div class="colbody">
		
		<form class="form-horizontal abcdpay">

			<div class="form-group">
				<h3 style="color: blue; text-align: center;">
					<U>Payment Details</U>
				</h3>
				<h5 style="color: black; text-align: center;">
					When finished, click the <u>"SUBMIT"</u> buttons.
				</h5>
				<br> <br>

				<div class="form-group">
					<input type="radio" name="card" value="debit card"> Credit
					Card <select>
						<option value="empty"></option>
						<option value="visa card">VISA Credit Card</option>
						<option value="sbi card">SBI Credit Card</option>
						<option value="citi card">CITI Credit Card</option>
						<option value="icici bank">ICICI Credit Card</option>
					</select>

				</div>
				<br> <br>
				<div class="form-group">
					<input type="radio" name="card" value="debit card"> Debit
					Card <select>&nbsp;
						<option value="empty"></option>
						<option value="visa card">VISA Debit Card</option>
						<option value="sbi card">SBI Debit Card</option>
						<option value="citi card">CITI Debit Card</option>
						<option value="icici bank">ICICI Debit Card</option>
					</select>

				</div>

				<br> <br>
				<div class="form-group">
					<input type="radio" name="card" value="net bank"> Net
					Banking <select>
						<option value="empty"></option>
						<option value="visa card">APEX BANK</option>
						<option value="sbi card">CANARA BANK</option>
						<option value="citi card">INDIAN BANK</option>
						<option value="icici bank">SBI BANK</option>
					</select>
				</div>

				<br> <br>
				<div class="form-group">
					<input type="radio" name="card" value="cash on delivery">
					Cash on Delivery<br>
				</div>

				<br> <br>
			<div class="text-center">
	
	       <a href="success_page" class="btn btn-success" role="button">SUBMIT</a>
	       <a href="tousde" class="btn btn-warning" role="button">Back</a>
			</div>
			
			</div>
		</form>
	</div>
	
	</body>
	</html>