
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

<body>
<%@include file="header.jsp"%>

<div class="container">

  <div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>CART DETAILS TABLE</strong></h2>
</div>
</div>
</div>
  <table class="table table-bordered style=color:black;">
  
      <tr>
        <th><h3 style=color:black;><strong>CATID</strong></h3></th> 
        <th><h3 style=color:black;><strong>PRODUCT ID</strong></h3></th>
        <th><h3 style=color:black;><strong>PRODUCT PRICE</strong></h3></th>
        
      </tr>
 
    
    
     <c:forEach var="cart" items="${cList}" varStatus="status">
      <tr>
          <td><h4 style=color:black;>${cart.catid}</h4></td>
          <td><h4 style=color:black;>${cart.productId}</h4></td>
          <td><h4 style=color:black;>${cart.prodPrice}</h4></td>
          
        
          <td>
           
            <a href = "toformadduserdetail" class = "btn btn-primary" role = "button">
               CHECK OUT
            </a> 
            </td>
            <td>
            <a href = "" class = "btn btn-primary" role = "button">
               CANCEL
            </a>
        
          </td>
      </tr>
      
      </c:forEach>
  
  </table>
</div>


