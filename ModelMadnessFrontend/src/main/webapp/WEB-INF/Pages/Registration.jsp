<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<link href="${pageContext.request.contextPath}/includes/css/home.css" rel="stylesheet">
  </head>
<body style="background-color:#66CDAA">
<div class="container-fluid">


<div class="row" style="margin-left:-70px">
<div class="col-md-8 col-sm-8 col-xs-8" >
<img src="${pageContext.request.contextPath}/includes/images/register.jpg" style="height:500;width:100%" />
</div>
<div class=" col-md-4 col-sm-4 col-xs-4" >
    <div class="form">
		<form">
			<h2 style="color:white;">Please Sign Up <small style="color:white;">It's free and always will be.</small></h2>
			<hr class="colorgraph">
			
				
		
			
			
			<div class="form-group">
				<input type="text" name="loginid" id="loginid" class="form-control input-lg" placeholder="Login Id">
			</div>
			<div class="form-group">
				<input type="text" name="username" id="username" class="form-control input-lg" placeholder="username">
			</div>
			
					<div class="form-group">
						<input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password">
					</div>
					
				
					
		
			
			
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-6 col-md-6"><button type="submit"  class="btn btn-primary btn-block btn-lg">Submit</button></div>
				<div class="col-xs-6 col-md-6"><a href="home" class="btn btn-success btn-block btn-lg">Cancel</a></div>
			</div>
		</form>
	</div>
</div>


</div>
</div>
</body>
</html>
