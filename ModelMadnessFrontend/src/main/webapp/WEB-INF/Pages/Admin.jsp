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
    <div class="panel with-nav-tabs panel-primary">
                <div class="panel-heading">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#tab1primary" data-toggle="tab">Product</a></li>
                            <li><a href="#ctgry" data-toggle="tab">Category</a></li>
                            <li><a href="#tab3primary" data-toggle="tab">Supplier</a></li>
                           
                        </ul>
                </div>
                <div class="panel-body">
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab1primary">
 <form:form modelAttribute="prod" cssClass="form-horizontal" action="./saveProduct" method="POST" enctype="multipart/form-data">
  <div class="form-group">
    <!-- <label class="control-label col-sm-2" for="pid"><h4 style="color:Black;" ><strong>Product ID:</strong></h4></label> -->
    <div class="col-sm-8">
      <form:input type="hidden" class="form-control" path="pid" value="${prod.pid}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>ProductName</strong></h4></label>
    <div class="col-sm-8">
      <form:input class="form-control" path="pname" value="${prod.pname }"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="price"><h4 style="color:black;"><strong>Price:</strong></h4></label>
    <div class="col-sm-8"> 
      <form:input class="form-control" path="price"  value="${prod.price }" />
    </div>
  </div>
     <div class="form-group">
    <label class="control-label col-sm-2" for="price"><h4 style="color:black;"><strong>Upload Image:</strong></h4></label>
		<div class="col-sm-8">
			<form:input path="pimg" value="${prod.pimg}" type="file" cssClass="form-control"/>
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
     
      <h1 style="color:black">"${success}"</h1>
     
      </div>
    </div>
  </div>
</div>
</div>
                        <div class="tab-pane fade" id="ctgry">
                        <form:form modelAttribute="category"  cssClass="form-horizontal" action="saveCategory" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="catid"><h4 style="color:Black;" ><strong>Category ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="cid" value="${category.cid}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="catname"><h4 style="color:Black;" ><strong>Category:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="cname" value="${category.cname}"/>
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
</div>
</div>
                        <div class="tab-pane fade" id="tab3primary">   
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
                        
                    </div>
                </div>
            </div>
            </div>


</body>
</html>