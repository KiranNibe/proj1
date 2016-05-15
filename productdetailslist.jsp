<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net/el"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/styles.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<form:form action="productdetailslist" method="GET">
		<input type="submit" value="show product" />
		<div align="center">
	<%int i=0; %>		
           <input type="hidden" id="status" name="status" value="status" />
		
     <h2>Spring Pagination using Display Tag</h2>
    <display:table  name="productList1"  keepStatus="true" requestURI="/productdetailslist" pagesize="15" class="its"  >
                 <display:column title="Sr No"  value="<%=++i %>"/>
                <display:column property="productName" title="Product Name"  paramId="productName" paramProperty="productName"        sortable="true"   />
                <display:column property="vendorName" title="Vendor Name" paramId="vendorName"  paramProperty="vendorName"    sortable="true"   />
                <display:column property="salePrice" title="Sale Price "   paramId="salePrice" paramProperty="salePrice"  sortable="true"   />
                <display:column property="warningQuantity" title="Quantity" paramId="warningQuantity"  paramProperty="warningQuantity"     sortable="true"   />
                <display:column property="description" title="Description" paramId="description" paramProperty="description" sortable="true"   />
<%--                 <display:column property="status" title="Status"  paramId="status" paramProperty="status"  sortable="true"   /> --%>
                <display:column property="productId" title="productId" paramId="productId"  paramProperty="productId" sortable="true" />
                <display:column title="Delete" paramId="productId" paramProperty="productId" href="${pageContext.request.contextPath}/deleteproductdeatils">Delete</display:column>
                 <display:column title="Update" paramId="productId" paramProperty="productId"  href="${pageContext.request.contextPath}/updateproductdetails">Update</display:column>
    </display:table>
    </div>
     
</form:form>
  <input type="hidden" value="productId" name="productId"/> 
</body>
</html>