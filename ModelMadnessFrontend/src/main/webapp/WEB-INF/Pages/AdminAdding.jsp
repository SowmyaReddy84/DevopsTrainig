<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Admin Adding Page</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<style>
		
			body {
				padding: 10px;
			}
			
			.container1 {
				margin-top:55px;
			}
			
			 #exTab1 .tab-content {
  				color : white;
  				background-color: #428bca;
  				padding : 5px 	15px;
			}

			
		/* remove border radius for the tab */

		 #exTab1 .nav-pills > li > a {
  		border-radius: 0;
		}
	.footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  /* Set the fixed height of the footer here */
  height: 50px;
  color:white;
  background-color: black;
}

	 



		</style>
	</head>	
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <div class="container1" align="center" >
			<h1>Admin Adding Page</h1>
		</div>
		<div id="exTab1" class="container">
			<ul class="nav nav-pills">
				<li class="active">
					<a href="#a1" data-toggle="tab">Product</a>
				</li>
				<li>
					<a href="#2a" data-toggle="tab">Category</a>
				</li>
				<li>
					<a href="#3a" data-toggle="tab">Supplier</a>
				</li>
			</ul>
			
			<div class="tab-content clearfix">
				<div class="tab-pane active" id="a1">
					<h3>Add Product</h3>
					<form class="form-horizontal" action="">
						<div class="form-group">
							<label class="control-label col-sm-4" for="productId">Product Id :  </label>
							<div class="col-sm-6">
								<input type="productId" class="form-control" id="productId" placeholder="Enter Product Id" name="productId">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="productName">Product Name :  </label>
							<div class="col-sm-6">
								<input type="productName" class="form-control" id="productName" placeholder="Enter Product Name" name="productName">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Product</button>
							</div>
						</div>
					</form>

				</div>
				<div class="tab-pane" id="2a">
					<h3>Add Category</h3>
					<form class="form-horizontal" action="">
						<div class="form-group">
							<label class="control-label col-sm-4" for="categoryId">Category Id :  </label>
							<div class="col-sm-6">
								<input type="categoryId" class="form-control" id="categoryId" placeholder="Enter Category Id" name="categoryId">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="categoryName">Category Name :  </label>
							<div class="col-sm-6">
								<input type="categoryName" class="form-control" id="categoryName" placeholder="Enter Category Name" name="categoryName">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Category</button>
							</div>
						</div>
					</form>
				</div>
				<div class="tab-pane" id="3a">
					<h3>Add Supplier</h3>
					<form class="form-horizontal" action="/addSupplier">
						<div class="form-group">
							<label class="control-label col-sm-4" for="supplierId">Supplier Id :  </label>
							<div class="col-sm-6">
								<input type="supplierId" class="form-control" id="supplierId" placeholder="Enter Supplier Id" name="supplierId">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="supplierName">Supplier Name :  </label>
							<div class="col-sm-6">
								<input type="supplierName" class="form-control" id="supplierName" placeholder="Enter Supplier Name" name="supplierName">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-4" for="sPassword">Supplier Password :  </label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="sPassword" placeholder="Enter Supplier Password" name="sPassword">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Add Supplier</button>
							</div>
						</div>
					</form>
					
				</div>
			</div> 
			
		</div>
    </body>
</html>