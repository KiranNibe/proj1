<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Customer Details</title>
</head>
<body>
<form method="get" action="updateselectedcustomerdetails">
    <table align="center" >
      <tr>
       <tr>
       <td>
       Customer Name<input id="customerName" type="text" name="customerName"   value="${customerDetails.customerName}">
       </td>
       </tr>
       
         <tr>
       <td>
       customer ID<input id="customerId" type="text" name="customerId"   value="${customerDetails.customerId}">
           
       </td>
       </tr>
        <tr> 
      <td>
       Mobile No<input id="mobile" type="text" name="mobile"  value="${customerDetails.mobile}">
       </td>
        </tr>
        <tr>
       <td>
      Telephone No<input id="telePhoneNo" type="text" name="telePhoneNo"  value="${customerDetails.telePhoneNo}">
       </td>
       </tr>
        <tr>
       <td>
       Sale Price<input id="email" type="text" name="email"  value="${customerDetails.email}">
       </td>
       </tr>
        <tr>
       <td>
    Address<input id="address" type="text" name="address"  value="${customerDetails.address}">
        </td></tr>
        
         <tr>
       <td>
    Zip Code<input id="zipCode" type="text" name="zipCode"  value="${customerDetails.zipCode}">
        </td></tr>
         <tr>
       <td>
    City<input id="city" type="text" name="city"  value="${customerDetails.city}">
        </td></tr>
         <tr>
       <td>
    State<input id="state" type="text" name="state"  value="${customerDetails.state}">
        </td></tr>
         <tr>
       <td>
    Country<input id="country" type="text" name="country"  value="${customerDetails.country}">
        </td></tr>
       
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