<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
	<h2 style="color:white;">Please Sign Up <small style="color:white;">It's free and always will be.</small></h2>
			<hr class="colorgraph">
    <div class="form">
		<form:form modelAttribute="userd" cssClass="form-horizontal" action="insertuserd" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="userid"><h4 style="color:Black;" ><strong>USER ID:</strong></h4></label>
    
      <form:input class="form-control" path="userid" value="${userd.userid}"/>
    
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>ProductName</strong></h4></label>
  
      <form:input class="form-control" path="username" value="${userd.username }"/>

  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="price"><h4 style="color:black;"><strong>Price:</strong></h4></label>
    <div class="col-sm-8"> 
      <form:input class="form-control" path="password"  value="${userd.password }" />
    </div>
  </div>
   
  
   
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
         <button type="submit" class="btn btn-warning" ><strong style="color:Black;">BACK</strong></button>
    </div>
  </div>
    
</form:form>
			
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-6 col-md-6"><button type="submit"  class="btn btn-primary btn-block btn-lg">Submit</button></div>
				<div class="col-xs-6 col-md-6"><a href="home" class="btn btn-success btn-block btn-lg">Cancel</a></div>
			</div>
		
	</div>
</div>


</div>
</div>
</body>
</html>
