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


<title>Ornatus</title>

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
<body>
<%@include file="header.jsp"%>
<div class="container">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS</strong></h2>
</div>
</div>
<div class="row"style="margin-left:-35px">

<div class="col-md-8 col-sm-8 col-xs-6 col-lg-8">
<div class = "thumbnail">
        
        <spring:url value="/resources/img/${product.pid}.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
</div>
  <div class="col-sm-4 col-md-4">
              <p><strong><h4 style="color:black">ID:${product.pid}</h4></strong></p> 
           <p><strong><h4 style="color:black">Name:${product.pname}</h4></strong></p> 
            <p><strong><h4 style="color:black">Price:${product.price}</h4></strong></p>
              <p>
            <a href = "addCart?Id=${product.pid}" class = "btn btn-primary" role = "button">
               ADD TO CART
            </a> 
             <a href = "backtoHome" class = "btn btn-primary" role = "button">
               BACK
            </a> 
           
         </p>   

          </div>
</div>
</div>

</body>
</html>