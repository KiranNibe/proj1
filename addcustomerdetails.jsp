<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer Details</title>
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
  <form action="addcustomerdetails" method="post">
    <table align="center" >
      <tr>
       <tr>
       <td>
       Customer Name<input id="customername" type="text" name="customername" placeholder="customername">
       </td>
       </tr>
        <tr> 
      <td>
       Mobile No<input id="mobileno" type="text" name="mobileno" placeholder="mobileno">
       </td>
        </tr>
        <tr> 
      <td>
        Telephone No<input id="telephoneno" type="text" name="telephoneno" placeholder="telephoneno">
        </td>
        </tr>
        <tr>
       <td>
       Email<input id="email" type="text" name="email" placeholder="email">
       </td>
       </tr>
        <tr>
       <td>
       Address<input id="address" type="text" name="address" placeholder="address">
       </td>
       </tr>
       <tr>
       <td>
       Zip Code<input id="zipcode" type="text" name="zipcode" placeholder="zipcode">
       </td>
       </tr>
        <tr>
       <td>
      
    Country<input id="country" type="text" name="country" placeholder="country">
        </td></tr>
         <tr>
       <td>
      
    State<input id="state" type="text" name="state" placeholder="state">
        </td></tr>
        
          <tr>
       <td>
      
    City <input id="city" type="text" name="city" placeholder="city">
        </td></tr>
      <tr>
       <td>
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