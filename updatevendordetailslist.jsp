<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Update Vendor Details</title>
</head>
<body>

   <script type="text/javascript">
function cancelAction()
{
document.location.href("home.jsp");
}
</script>

<script type="text/javascript">
<%=session.getAttribute("message")%>
function Confirm(form){
	var Msg=<%=session.getAttribute("message")%>
	if(Msg=="1")
		{
alert("Record insert successfully!"); 
}
	else 
		{
		alert("Record insert failure!"); 
		}
 form.submit();
}
</script> 
<body>
  <form action="updateselectedvendordetails" method="get">
    <table align="center" >
      <tr>
       <tr>
       <td>
       Vendor Name<input id="vendorname" type="text" name="vendorName" value="${vendorDetails.vendorName}" />
       </td>
       </tr>
       
        <tr>
       <td>
       Vendor ID<input id="vendorId" type="text" name="vendorId"  value="${vendorDetails.vendorId}"/>
       </td>
       </tr>
        <tr> 
      <td>
       Mobile No<input id="mobileno" type="text" name="mobileNo"   value="${vendorDetails.mobileNo}"/>
       </td>
        </tr>
        <tr> 
      <td>
        Telephone No<input id="telephoneno" type="text" name="phoneNo"  value="${vendorDetails.phoneNo}">
        </td>
        </tr>
        <tr>
       <td>
       Website<input id="website" type="text" name="website" value="${vendorDetails.website}">
       </td>
       </tr>
        <tr>
       <td>
       Email<input id="email" type="text" name="email" value="${vendorDetails.email}">
       </td>
       </tr>
        <tr>
       <td>
       Address<input id="address" type="text" name="address" value="${vendorDetails.address}">
       </td>
       </tr>
       <tr>
       <td>
       Zip Code<input id="zipCode" type="text" name="zipCode" value="${vendorDetails.zipCode}">
       </td>
       </tr>
        <tr>
       <td>
      
    Country<input id="country" type="text" name="country" value="${vendorDetails.country}">
        </td></tr>
         <tr>
       <td>
      
    State<input id="state" type="text" name="state" value="${vendorDetails.state}">
        </td></tr>
        
          <tr>
       <td>
      
    City <input id="city" type="text" name="city" value="${vendorDetails.city}">
        </td></tr>
      <tr>
       <td>
         <input type="button" name="Update" value="Submit" onClick="Confirm(this.form)">
       </td>
       <td>
         <input type="submit" value="Cancel" name="Cancel"  />
       </td>
      </tr>
    </table>
    </form>
    
</body>
</html>