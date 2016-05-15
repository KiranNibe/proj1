<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="display" uri="http://displaytag.sf.net/el"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Purchase Order Details</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">
 <script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
 <script src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
 <script src="${pageContext.request.contextPath}/resources/js/addInput.js" language="Javascript" type="text/javascript"></script>
<script type="text/javascript">

function check_dd() {
	alert("hi")
    if(document.getElementById('vendorname').value == "") {
        document.getElementById('showMe').style.display = 'none';
    } else {
        document.getElementById('showMe').style.display = 'block';
    }
}

</script>


<!-- <script> -->
<!-- // function get(){ -->
<!-- //  var str="",i; -->

<!-- // for (i=0;i<selectproduct.productname.options.length;i++) { -->
<!-- //     if (selectproduct.productname.options[i].selected) { -->
<!-- //         str += selectproduct.productname.options[i].value + ","; -->
<!-- //     } -->
<!-- // } -->
<!-- // if (str.charAt(str.length - 1) == ',') { -->
<!-- //   str = str.substr(0, str.length - 1); -->
<!-- // } -->
<!-- // alert("Options selected are " + str); -->
<!-- // } -->
<!-- </script> -->
<script type="text/javascript">

function ShowItems()
{
	var selectitem=document.getElementById("selectitem");
    document.getElementById("Values").innerHTML = "";
  for (i=0; i < document.getElementById("productname").length; i++) {
    if (document.getElementById("productname").options[i].selected == true) {
        var br = document.createElement("br");
        document.getElementById('selectitem').appendChild(br);
        var input=document.createElement("input");
        input.type="text";
        input.name="productName"+i;
        input.value=document.getElementById("productname").options[i].value;
        selectitem.appendChild(input);
        
        //for quantity
        var quantitylabel=document.createElement('label');
        quantitylabel.appendChild(document.createTextNode('quantity'));
        var quantitytextbox=document.createElement('input');
        quantitytextbox.id='quantity';
        quantitylabel.appendChild(quantitytextbox);
        document.getElementById('selectitem').appendChild(quantitylabel);
        
        //for price
        var pricelabel=document.createElement('label');
        pricelabel.appendChild(document.createTextNode('price'));
        var pricetextbox=document.createElement('input');
        var totalamountValue;
        pricetextbox.id='price';
        pricelabel.appendChild(pricetextbox);
        document.getElementById('selectitem').appendChild(pricelabel);
        
        
        //for totalamount
        
        var totalamountlabel=document.createElement('label');
        totalamountlabel.appendChild(document.createTextNode('Total Amount'));
        var totalamounttextbox=document.createElement('input');
        totalamounttextbox.setAttribute("id", "totalamount");
        totalamounttextbox.onclick=function()
        {
        	var quantityValue=document.getElementById('quantity').value;
            var priceValue=document.getElementById('price').value;
            totalamountValue=quantityValue*priceValue;
        	alert(quantityValue*priceValue);
        	alert(totalamountValue);
        	document.getElementById('totalamount').value=totalamountValue;
        }
//          if(document.getElementById('quantity').value!='' && document.getElementById('price').value!=null)
//            {
             
//         	 totalamountlabel.setAttribute("value", (document.getElementById('quantity').value*document.getElementById('price').value));
           
//            }
         totalamountlabel.appendChild(totalamounttextbox);
        document.getElementById('selectitem').appendChild(totalamountlabel);
        
    }
  }
}
//         var label;
//         label = document.createElement('label');
//         label.appendChild(document.createTextNode('quantity'));
//         var textbox1 = document.createElement('input');
//         textbox1.id='quantity';
//         textbox1.type = 'text';
//         label.appendChild(textbox1);
//         document.getElementById('selectitem').appendChild(label);
//         var label;
//         label = document.createElement('label');
//         label.appendChild(document.createTextNode('Price'));
//         var textbox2 = document.createElement('input');
//         textbox2.id='price';
//         textbox2.type = 'text';
//         label.appendChild(textbox2);
//         document.getElementById('selectitem').appendChild(label);
//         var p1=document.getElementById('quantity').value;
//         var p2=document.getElementById('price').value;
//         var label;
//         label = document.createElement('label');
//         var totalAmountLabel=document.createElement('label');
//          totalAmountLabel.innerHTML = 'Total Amount';
//          totalAmountLabel.onClick=function(){
//              label.value=p1*p2;
//              alert(label);
//              alert(label.value);
         	
//          };
//         totalAmountLabel.setAttribute("id", 'totalAmountLabel');
//         label.appendChild(totalAmountLabel);
//         var totalAmount = document.createElement('input');
// //         totalAmount.type = 'text';
// //         totalAmount.id= 'totalAmount';
//         totalAmount.onClick=function()
//         {
//         	 var p1=document.getElementById('quantity').value;
//              var p2=document.getElementById('price').value;
//              alert("hi");
//              totalAmountLabel.setAttribute("value", p1*p2);
        	
//         }
//         label.appendChild(totalAmount);
//         document.getElementById('selectitem').appendChild(label);
//     }
    
    
//   }
//   var br = document.createElement("br");
//   document.getElementById('selectitem').appendChild(br);
//   var label;
//   label = document.createElement('label');
//   label.appendChild(document.createTextNode('Total product Amount'));
//   var textbox = document.createElement('input');
//   textbox.type = 'text';
//   label.appendChild(textbox);
//   document.getElementById('selectitem').appendChild(label);
  
//   var br = document.createElement("br");
//   document.getElementById('selectitem').appendChild(br);
//   label = document.createElement('label');
//   label.appendChild(document.createTextNode('Service Tax'));
//   var textbox = document.createElement('input');
//   textbox.type = 'text';
//   label.appendChild(textbox);
//   document.getElementById('selectitem').appendChild(label);
//   label = document.createElement('label');
//   label.appendChild(document.createTextNode('VAT'));
//   var textbox = document.createElement('input');
//   textbox.type = 'text';
//   label.appendChild(textbox);
//   document.getElementById('selectitem').appendChild(label);
//   label = document.createElement('label');
//   label.appendChild(document.createTextNode('LBT'));
//   var textbox = document.createElement('input');
//   textbox.type = 'text';
//   label.appendChild(textbox);
//   document.getElementById('selectitem').appendChild(label);
  
  
// }

</script>
<script>
  $(function() {
    $( "#purchaseDate" ).datepicker();
  });
  
  function ontotalAmountChange()
  {
	  alert("suceess");
  }
  
  </script>
</head>
<body>
 <form action="selectedvendorrecord" method="post">
  <div id="vid">
  <table>
  <tr>
  <td>
  <select name="vendorname" id="vendorname"  onchange="this.form.submit()">
   <option>select Vendor</option>
  <c:forEach items="${vendorDetailsList}" var="vendorname1">
<%--       <option value="${country.key}" ${param.country == country.key ? 'selected' : ''}>${country.value}</option> --%>
      <option value="${vendorname1.vendorName}" ${vendorname1.vendorName == vendorname ?'selected' : ''}>${vendorname1.vendorName}</option>
<%--     <option value="${vendorname.vendorName}">${vendorname.vendorName}</option> --%>
  </c:forEach>
</select>
  </td>
  </tr>
  </table>
  </div>
  </form>
  <c:if test="${not empty Message}">
  
  <table>
  <tr> 
      <td>
       Mobile No<input id="mobileno" type="text" name="mobileno"  value="${mobileno}" >
       </td>
        </tr>
        <tr> 
      <td>
        Telephone No<input id="telephoneno" type="text" name="telephoneno"  value="${telephoneno}" >
        </td>
        </tr>
        
        <tr> 
      <td>
       Website<input id="website" type="text" name="website" value="${website}" >
        </td>
        </tr>
        <tr>
       <td>
       Email<input id="email" type="text" name="email"  value="${email}">
       </td>
       </tr>
        <tr>
       <td>
       Address<input id="address" type="text" name="address"  value="${address}">
       </td>
       </tr>
       <tr>
       <td>
       Zip Code<input id="zipcode" type="text" name="zipcode" value="${zipcode}">
       </td>
       </tr>
        <tr>
       <td>
      
    Country<input id="country" type="text" name="country" value="${country}">
        </td></tr>
         <tr>
       <td>
      
    State<input id="state" type="text" name="state"  value="${state }">
        </td></tr>
        
          <tr>
       <td>
      
    City <input id="city" type="text" name="city" value="${city}">
        </td></tr>
        
  </table>
  </c:if>
 
  <form action="selectedproductrecord" name="selectproduct" method="post" id="selectedproductrecord">
  <table>
   <tr>
       <td>
     
      
    Order No <input id="orderNo" type="text" name="orderNo" value="${orderNo}" >
        </td></tr>
        
         <tr>
          <td>
            Date <input type="text" name="purchaseDate"  id="purchaseDate" value="${purchaseDate}"/>
          </td>
         </tr>
         
         <tr>
         <td>
           Remark <textarea id="remark" name="remark"  >
           ${remark}
           </textarea>
         </td>
         </tr>
   <tr>
   <td>
   <input type="hidden" id="vendorName" name="vendorName" value="${vendorname}">
<%--       <input type="hidden" id="orderNo" name="orderNo" value="${orderNo}"> --%>
<%--       <input type="hidden" id="purchaseDate" name="purchaseDate" value="${purchaseDate}"> --%>
<%--             <input type="hidden" id="remark" name="remark" value="${remark}"> --%>
      
   
   
   </td>
   </tr>
  <tr>
  <td>
  <select name="productname" id="productname"  multiple="multiple">
   <option>select Product</option>
  <c:forEach items="${productDetailsList}" var="productname1">
  
      <option value="${productname1.productName}" ${productname1.productName == productName ?'selected':''}>${productname1.productName}</option>
      
  </c:forEach>
</select>
  </td>
  </tr>
 <tr>
  <td>
    <input type="button" value="ADD To Cart"  onclick="ShowItems()"/>
  </td>
  </tr>
 
  </table>
  
  </form>
   <div id="selectitem">
   <b>You selected items:</b>
       <span id="Values"></span>
       </div>
<%--   <form action="selectedAmount" method="post"> --%>
<!--   <table> -->
<!--   <tr> -->
<!--   <td> -->
<%--      <input type="hidden" id="vendorname" name="vendorname" value="${vendorname}"> --%>
<%--       <input type="hidden" id="productname" name="productname" value="${productname}"> --%>
<%--       <input type="hidden" id="orderNo" name="orderNo" value="${orderNo}"> --%>
<%--       <input type="hidden" id="purchaseDate" name="purchaseDate" value="${purchaseDate}"> --%>
<%--             <input type="hidden" id="remark" name="remark" value="${remark}"> --%>
     
<!--   </td> -->
<!--   </tr> -->
  
  
<!--  <tr> -->
<!--  <td> -->
<%--    Quantity <input type="text" id="quantity"  name="quantity" value="${quantity}" > --%>
<!--  </td> -->
<!--  </tr> -->
<!--   <tr> -->
<!--   <td> -->
<%--    Purchase Price <input type="text" id="purchaseprice" name="purchaseprice"  value="${salePrice}"> --%>
<!--   </td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--   <td> -->
<%--   Total amount<input type="text" id="totalamount"  value="${totalamount}"  onclick="this.form.submit()"  > --%>
<!--   </td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--   <td> -->
<!--   <input type="button" id="add" name="Add" title="Add New Product"   value="Add"  > -->
<!--   </td> -->
<!--   </tr> -->
<!--   </table> -->
<%--   </form> --%>
  
 


</body>
</html>