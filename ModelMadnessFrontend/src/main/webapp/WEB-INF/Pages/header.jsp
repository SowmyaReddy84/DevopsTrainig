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

<header>
      <nav class="navbar navbar-default" role="naviagation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#" title="ModelMadnesss">
                     </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1"style=margin-right:30px">
  
      <ul class="nav navbar-nav"style=margin-right:30px">
         <li><a href="#"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>

                 <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Boys & Men <span class="caret"></span></a>
          <ul class="dropdown-menu multi-column" role="menu">
						<li>
							<div class="row">
								<div class="col-sm-6">
									<ul class="dropdown-menu">
										<li><a href="#">Affiliates</a></li>
										<li><a href="#">Basis Products</a></li>
										<li><a href="#">Books</a></li>
										<li><a href="#">Brokers</a></li>
										<li><a href="#">Calendars</a></li>
										<li><a href="#">Carriers</a></li>
										<li><a href="#">Classes</a></li>
										<li><a href="#">Counterparties</a></li>
									</ul>
								</div>
								<div class="col-sm-6">
									<ul class="dropdown-menu">
										<li><a href="#">Disaggregation Indicators</a></li>
										<li><a href="#">Locations</a></li>
										<li><a href="#">Products</a></li>
										<li><a href="#">Program Changes</a></li>
										<li><a href="#">Publishers</a></li>
										<li><a href="#">Regions</a></li>
										<li><a href="#">Strategies</a></li>
										<li><a href="#">Traders</a></li>
									</ul>
								</div>
							</div>
						</li>
					</ul>
        </li>
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home & Furniture <span class="caret"></span></a>
          <ul class="dropdown-menu">
          <li><a href="#" style="font-size:20px"><b>Furnishing</b></a></li>
            <li><a href="#">Bedsheets</a></li>
            <li><a href="#">Curtains</a></li>
            <li><a href="#">Towels & Mats</a></li>
            <li><a href="#">Cushions & Pillow Covers</a></li>
            <li><a href="#">Kitchen & Dining Linen</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#" style="font-size:20px"><b>Home Decor</b></a></li>
            <li><a href="#">Clocks</a></li>
            <li><a href="#">Wall Shelves</a></li>
            <li><a href="#">Painting</a></li>
            <li><a href="#">Wall Decals</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#" style="font-size:20px"><b>Lightning</b></a></li>
            <li><a href="#">Smart Lightning</a></li>
            <li><a href="#">LED & CFL</a></li>
            <li><a href="#">Decorative Lightning& lamps</a></li>
           
          </ul>
      </li>
    <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Electronics <span class="caret"></span></a>
          <ul class="dropdown-menu">
          <li><a href="#" style="font-size:20px"><b>Computers & Gaming</b></a></li>
            <li><a href="#">Laptops</a></li>
            <li><a href="#">MacBooks</a></li>
            <li><a href="#">2 in 1 Laptops</a></li>
            <li><a href="#">Keyboards</a></li>
            <li><a href="#">Mouse</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#" style="font-size:20px"><b>Televisons</b></a></li>
            <li><a href="#">Full HD TVs</a></li>
            <li><a href="#">Smart TVs</a></li>
            <li><a href="#">Ultra HD TVs</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#" style="font-size:20px"><b>Refrigetors</b></a></li>
            <li><a href="#">Single Door</a></li>
            <li><a href="#">Multi Door</a></li>
            <li><a href="#">Double Door</a></li>
           
          </ul>
      </li>
         <li>
            <form class="navbar-form" role="search">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="search" name="q">
                <div class="input-group-btn">
                    <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                </div>
            </div>
            </form>    
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
         <li><a href="${pageContext.request.contextPath}/logout">Logout User</a></li>
      <li>
          <a href="#" class="btn btn-link"><span ></span>Hi :${pageContext.request.userPrincipal.name}
         
        </a>
        </li>
 
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>Login/Signup<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><c:if test="${pageContext.request.userPrincipal.name== null}">
            
            <a href="login"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbspLogin</a></c:if></li>
            <li><a href="register"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>Register</a></li>
            <li><c:if test="${pageContext.request.userPrincipal.name!= null}">
            <a href="/logout"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Logout</a></c:if></li>
            <li> 
         <a href="totablecart" class="btn btn-primary">
          <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Cart</a>
      
  
        <%-- <c:url value="/logout" var="logoutUrl" />
        <form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>--%>
	
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
		
            </li>
         </ul>
        </li>
        <li>
          <a href="totablecart">
          <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Cart</a>  
        </li>
      </ul>
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
      
    </header>
    </body>
   </html>
   