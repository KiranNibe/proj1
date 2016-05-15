<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add product</title>
</head>

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
  <form action="saveproductdetails" method="post">
    <table align="center" >
      <tr>
       <tr>
       <td>
       Product Name<input id="productname" type="text" name="productname" placeholder="productname">
       </td>
       </tr>
        <tr> 
      <td>
       Vendor Name<input id="vendorname" type="text" name="vendorname" placeholder="vendorname">
       </td>
        </tr>
        <tr>
       <td>
       Warning Quantity<input id="warningquantity" type="text" name="warningquantity" placeholder="warningquantity">
       </td>
       </tr>
        <tr>
       <td>
       Sale Price<input id="saleprice" type="text" name="saleprice" placeholder="saleprice">
       </td>
       </tr>
        <tr>
       <td>
      
    Product Description<input id="productdescription" type="text" name="productdescription" placeholder="productdescription">
        </td></tr>
<!--         <tr>      -->
<!--         <td align="left">Status -->
<!--        <select id="status" name="status"> -->
<!--        <option value="1">ACTIVE</option> -->
<!--        <option value="0">DEACTIVE</option> -->
<!--       </select>  -->
<!--        </td> -->
<!--       </tr> -->
      <tr>
       <td>
<!--          <input type="submit"  value="Save"  /> -->
         <input type="button" name="Submit" value="Submit" onClick="Confirm(this.form)">
       </td>
       <td>
         <input type="submit" value="Cancel" name="Cancel"  />
       </td>
      </tr>
    </table>
    </form>
    
</body>
</html>