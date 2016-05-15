<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Dashboard</title>

<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
<link href="${pageContext.request.contextPath}/resources/css/styles.css"
	rel="stylesheet">
<%-- <link href="${pageContext.request.contextPath}/resources/css/dashboard.css" rel="stylesheet"> --%>

<style>
.sidebar {
	background-color: #F5F5F5;
	border-right: 1px solid #EEE;
}
</style>

</head>
<body>
	<!-- header -->
	<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Dashboard</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a class="dropdown-toggle" role="button"
						data-toggle="dropdown" href="#"><i
							class="glyphicon glyphicon-user"></i> Admin <span class="caret"></span></a>
						<ul id="g-account-menu" class="dropdown-menu" role="menu">
							<li><a href="#">My Profile</a></li>
						</ul></li>
					<li><a href="#"><i class="glyphicon glyphicon-lock"></i>
							Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#"><span
							class="glyphicon glyphicon-home"></span> Overview <span
							class="sr-only">(current)</span></a></li>
					<li><a href="#"><span
							class=" glyphicon glyphicon-resize-full"></span> Reports</a></li>
					<li><a href="#">Analytics</a></li>
					<li><a href="#">Export</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item</a></li>
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
					<li><a href="">More navigation</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
				</ul>
			</div>
			<div >
				<div >
					<form action="${pageContext.request.contextPath}/saveproductdetails" method="post">
                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>

					<div class="col-md-3">
					    <a   href="${pageContext.request.contextPath}/addproductpage">
                      					   <input type="hidden" id="productId" name="productId" value="${productDetails.productId}">
                      					      <div >Add Product</div>
                    </a>
					</div>
					</form>
					<form action="${pageContext.request.contextPath}/productdetailslist" method="post">
					   <input type="hidden" id="productId" name="productId" value="${productDetails.productId}">
					                       <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
					   
					<div class="col-md-3">
					    <a  href="${pageContext.request.contextPath}/showproductlistpage">
                    <div >List Product</div>
                    </a>
                    </div>
                    </form>
                    
                    <form action="${pageContext.request.contextPath}/addcustomerdetails" method="post">
					<div >
					    <a  href="${pageContext.request.contextPath}/addcustomerpage">
                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
                    <div >Save Customer</div>
                    </a>
                    </div>
                    </form>
                    <form action="${pageContext.request.contextPath}/customerdetailslist" method="GET">
					                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
					
					<div class="col-md-3">
                    <a  href="${pageContext.request.contextPath}/showcustomerListpage">
                    <div > Customer List</div>
                    </a>
                    </div>
                    </form>
                    
                     <form action="${pageContext.request.contextPath}/addvendordetails" method="post">
					<div >
					    <a  href="${pageContext.request.contextPath}/addvendorpage">
                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
                    <div >Save Vendor</div>
                    </a>
                    </div>
                    </form>
                    <form action="${pageContext.request.contextPath}/vendordetailslist" method="GET">
					                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
					
					<div class="col-md-3">
                    <a  href="${pageContext.request.contextPath}/showvendorListpage">
                    <div > Vendor List</div>
                    </a>
                    </div>
                    </form>
                    
                    <form action="${pageContext.request.contextPath}/purchaseorderdetails" method="GET">
					                    <span class="icon32 icon-red icon-archive" style="padding-right: 3px;"></span>
					
					<div class="col-md-3">
                    <a  href="${pageContext.request.contextPath}/showpurchaseorderpage">
                    <div > purchase order</div>
                    </a>
                    </div>
                    </form>
				</div>
			</div>
		</div>
	</div>
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>