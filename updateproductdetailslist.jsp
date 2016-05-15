<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product List </title>
</head>
<body>




<body>
<%-- <%=session.getAttribute("productList1") %>   --%>

<%-- ${productDetails.productId} --%>
        
<form method="get" action="updateselectedproductdetails">
    <table align="center" >
      <tr>
       <tr>
       <td>
       Product Name<input id="productname" type="text" name="productname"  placeholder="productname" value="${productDetails.productName}">
       </td>
       </tr>
       
         <tr>
       <td>
       Product ID<input id="productId" type="text" name="productId"  placeholder="productId" value="${productDetails.productId}">
           
       </td>
       </tr>
        <tr> 
      <td>
       Vendor Name<input id="vendorname" type="text" name="vendorname" placeholder="vendorname" value="${productDetails.vendorName}">
       </td>
        </tr>
        <tr>
       <td>
       Warning Quantity<input id="quantity" type="text" name="quantity" placeholder="warningquantity" value="${productDetails.warningQuantity}">
       </td>
       </tr>
        <tr>
       <td>
       Sale Price<input id="saleprice" type="text" name="saleprice" placeholder="saleprice" value="${productDetails.salePrice}">
       </td>
       </tr>
        <tr>
       <td>
    Product Description<input id="productdescription" type="text" name="productdescription" placeholder="productdescription"value="${productDetails.description}">
        </td></tr>
<!--         <tr>      -->
<%--          <c:if test="${productDetails.status==1}"> --%>
<!--         <td align="left">Status -->
<!--        <select id="status" name="status"> -->
<!--        <option value="1" selected >ACTIVE</option> -->
<!--        <option value="0" >DEACTIVE</option> -->
<!--       </select>  -->
<!--        </td> -->
<%--         </c:if>        --%>
<%--          <c:if test="${productDetails.status==0}"> --%>
<!--          <td align="left">Status -->
<!--        <select id="status" name="status"> -->
<!--        <option value="1"  >ACTIVE</option> -->
<!--        <option value="0" selected>DEACTIVE</option> -->
<!--       </select>  -->
<!--        </td> -->
<%--         </c:if> --%>
         
<!--       </tr> -->
      <tr>
       <td>
         <input type="submit" name="Update" value="Update" onClick="Confirm(this.form)">
       </td>
       <td>
         <input type="submit" value="Cancel" name="Cancel"  />
       </td>
      </tr>
    </table>
    </form>

</body>
</html>