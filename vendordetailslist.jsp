<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="display" uri="http://displaytag.sf.net/el"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
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
	<form:form action="vendordetailslist" method="GET">
		<input type="submit" value="show customer" />
		<div align="center">
	<%int i=0; %>		
<!--            <input type="hidden" id="status" name="status" value="status" /> -->
<%--            <%=status %> --%>
     <h2>Spring Pagination using Display Tag</h2>
                
               <display:table  name="vendorDetailsList"  keepStatus="true" requestURI="/vendordetailslist" pagesize="15">
                 <display:column title="Sr No" value="<%=++i %>"/>
                <display:column property="vendorName" title="Vendor Name"  paramId="vendorName" paramProperty="vendorName"   sortable="true"   />
                <display:column property="mobileNo" title="Mobile No" paramId="mobile"  paramProperty="mobileNo"    sortable="true"   />
                <display:column property="phoneNo" title="Telephone Number"   paramId="phoneNo" paramProperty="phoneNo"  sortable="true"   />
                <display:column property="website" title="Website" paramId="website"  paramProperty="website"     sortable="true"   />
                <display:column property="email" title="Email" paramId="email"  paramProperty="email"     sortable="true"   />
                <display:column property="address" title="Address" paramId="address" paramProperty="address" sortable="true"   />
                <display:column property="zipCode" title="Zip Code" paramId="zipCode"  paramProperty="zipCode" sortable="true" />
                <display:column property="city" title="City" paramId="city"  paramProperty="city" sortable="true" />
                <display:column property="state" title="State" paramId="state"  paramProperty="state" sortable="true" />
                <display:column property="country" title="Country" paramId="country"  paramProperty="country" sortable="true" />
                                <display:column property="vendorId" title="vendorId" paramId="vendorId"  paramProperty="vendorId" sortable="true" />
                
                 <display:column title="Update" paramId="vendorId" paramProperty="vendorId"  href="${pageContext.request.contextPath}/updatevendordetails">Update</display:column>
                <display:column title="Delete" paramId="vendorId" paramProperty="vendorId" href="${pageContext.request.contextPath}/deletevendordetails">Delete</display:column>
    </display:table>
    </div>
</form:form>
</body>
</html>