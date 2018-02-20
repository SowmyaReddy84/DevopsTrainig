
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body style="background-color:#76D7C4;">
<div class="container">

    <div class="row">
<div class="page-header">
<div>
<h2 style="color:black;" font-weight:100%;><strong>USER DETAILS FORM</strong></h2>
</div>
</div>
</div>

<form:form modelAttribute="userdetail"  cssClass="form-horizontal" action="saveUserDetail" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>User ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="userId" value="${userdetail.userId}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>First Name:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="firstname" value="${userdetail.firstname }"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="price"><h4 style="color:black;"><strong>Last Name:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="lastname" value="${userdetail.lastname}" />
    </div>
  </div>
   
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Contact:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="contact" value="${userdetail.contact }"/>
    </div>
  </div> 
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Shipping:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="shipping" value="${userdetail.shipping }"/>
    </div>
  </div> 
  
   
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Pin code:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="pincode" value="${userdetail.pincode }"/>
    </div>
  </div> 
  
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
    
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
        <a href="tocarttable" class="btn btn-warning" role="button"><strong style="color:Black;">Back</strong></a>
          <a href="gotopayment" class="btn btn-warning" role="button"><strong style="color:Black;">Next</strong></a>
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
</div>

    </div>
