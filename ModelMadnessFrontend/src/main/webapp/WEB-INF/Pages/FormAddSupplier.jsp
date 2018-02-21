
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
    	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Admin Adding Page</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<spring:url value="/resources/css/home.css" var="style"/><link rel="stylesheet" href="${style}">
		
	</head>	
    <body>
    <%@include file="header.jsp"%>
    <div class="container">
    <div class="page-header">
        <h1>Admin start your task<span class="pull-right label label-default">:)</span></h1>
    </div>
    <form:form modelAttribute="supplier"  cssClass="form-horizontal" action="saveSupplier" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="supid"><h4 style="color:Black;" ><strong>Supplier Id:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="sid" value="${supplier.sid}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="catname"><h4 style="color:Black;" ><strong>Supplier Name:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="sname" value="${supplier.sname}"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="sup"><h4 style="color:Black;" ><strong>Supplier Mobile:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="mobile" value="${supplier.mobile}"/>
    </div>
  </div>
  
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
         <button type="submit" class="btn btn-warning" ><strong style="color:Black;">BACK</strong></button>
    </div>
  </div>
    
</form:form>
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
    
      <div class="modal-body">
     
      <h1>"${success}"</h1>
     
      </div>
    </div>
  </div>
</div></div>


</body>
</html>