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

<body style="background-color:#66CDAA">
<div class="container-fluid">


<div class="row" style="margin-left:-70px">
<div class="col-md-8 col-sm-8 col-xs-8" >
<spring:url value="/resources/img/sign-in.jpg" var="imgs" /><img style="height:500;width:100%" src="${imgs}"/>

</div>
<div class=" col-md-4 col-sm-4 col-xs-4" >
    <div class="form">
		<form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
			<h2 style="color:white;">Please Sign In <small style="color:white;">If u already have an account</small></h2>
			<h2>else</h2>
			<a href="signup" class="button">Register</a>
			<hr class="colorgraph">
			
				
		
			
			
			<div class="form-group">
				<input type="text" name="username" id="username" class="form-control input-lg" placeholder="User Id">
			</div>
			
					<div class="form-group">
						<input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password">
					</div>
				
					
		
			
			
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-6 col-md-6"><button type="submit" name="submit" value="submit"  class="btn btn-primary btn-block btn-lg">Submit</button></div>
				
			
				<div class="col-xs-6 col-md-6"><a href="#" class="btn btn-success btn-block btn-lg">Cancel</a></div>
			</div>
						
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
		</form>
	</div>
</div>


</div>
</div>
</body>
</html>
