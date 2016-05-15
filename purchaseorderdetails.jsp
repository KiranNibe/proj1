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
<script type="text/javascript">

// function ShowItems()
// {
// 	var selectitem=document.getElementById("selectitem");
//     document.getElementById("Values").innerHTML = "";
//   for (i=0; i < document.getElementById("productname").length; i++) {
//     if (document.getElementById("productname").options[i].selected == true) {
//         var br = document.createElement("br");
//         document.getElementById('selectitem').appendChild(br);
//         var input=document.createElement("input");
//         input.type="text";
//         input.name="productName"+i;
//         input.id="productname"+i;
//         input.value=document.getElementById("productname").options[i].value;
//         alert(input.value);
//         alert(input.id);
//         selectitem.appendChild(input);

        
//        if(document.getElementById("productname").options[i].value==input.value)
//   {
    	   
    	   //for quantity
//         var quantitylabel=document.createElement('label');
//         quantitylabel.appendChild(document.createTextNode('quantity'));
//         var quantitytextbox=document.createElement('input');
//         quantitytextbox.id='quantity';
//         quantitylabel.appendChild(quantitytextbox);
//         document.getElementById('selectitem').appendChild(quantitylabel);
        
        
        
//         //for price
//         var pricelabel=document.createElement('label');
//         pricelabel.appendChild(document.createTextNode('price'));
//         var pricetextbox=document.createElement('input');
//         pricetextbox.id='price';
//         pricelabel.appendChild(pricetextbox);
//         document.getElementById('selectitem').appendChild(pricelabel);
//         document.getElementById("productname").options[i].value
        

//         //for totalamount
//         var totalamountlabel=document.createElement('label');
//         totalamountlabel.appendChild(document.createTextNode('Total Amount'));
//         var totalamounttextbox=document.createElement('input');
//         totalamounttextbox.setAttribute("id", "totalamount");
//         totalamounttextbox.onclick=function()
//         {
//         	var quantityValue=document.getElementById('quantity').value;
//             var priceValue=document.getElementById('price').value;
//             alert("ihi");
//             alert(quantityValue);
//             alert(priceValue);
//             var totalamountValue;
//             totalamountValue=quantityValue*priceValue;
// //         	alert(quantityValue*priceValue);
// //         	alert(totalamountValue);
// //         	alert(document.getElementById("productname"+i).id);
// //         	if(input.id==document.getElementById("productname"+i).id)
// //      		   {
//         	document.getElementById('totalamount').value=totalamountValue;
//      		   }
     		   
//          totalamountlabel.appendChild(totalamounttextbox);
//         document.getElementById('selectitem').appendChild(totalamountlabel);
//   }
//   }
// }
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

<script type="text/javascript">
function ShowItems() {
	document.getElementById("selectedItemsWrap").style.display = 'block';
    var selectedItemsWrap = document.getElementById("selectedItemsWrap");
    var productList = document.getElementById("productname");
    var sumsumAmount=0;
    document.getElementById("Values").innerHTML = "";

    for (i = 0; i < productList.length; i++) {
        if (productList.options[i].selected == true) {

            // CREATE, APPEND <BR />
            var br = document.createElement("br");
            selectedItemsWrap.appendChild(br);

            // CREATE, APPEND "productName" INPUT
            var inputProductName = document.createElement("input");
            inputProductName.type = "text";
            inputProductName.name = "selectedProduct";
            inputProductName.id = "selectedProduct" + i;
            inputProductName.value = productList.options[i].value;
            selectedItemsWrap.appendChild(inputProductName);



            // CREATE, APPEND "quantity" <LABEL>
            var labelQuantity = document.createElement('label');
            selectedItemsWrap.appendChild(labelQuantity);
selectedItemsWrap.appendChild(document.createTextNode('quantity'));
            // CREATE, APPEND quantity <INPUT>
            var inputQuantity = document.createElement('input');
            inputQuantity.type = "text";
            inputQuantity.id = 'quantity' + i;
            inputQuantity.name="quantity";
            selectedItemsWrap.appendChild(inputQuantity);


            // CREATE, APPEND "price" <LABEL>
            var labelPrice = document.createElement('label');
labelPrice.appendChild(document.createTextNode('price'));
            selectedItemsWrap.appendChild(labelPrice);
            // CREATE, APPEND "price" <INPUT>
            var inputPrice = document.createElement('input');
            inputPrice.type = "text";
            inputPrice.id = 'price' + i;
            inputPrice.name="price";
            inputPrice.setAttribute("onblur", "singleProdAmountCalc(" + i + ")");
            
            selectedItemsWrap.appendChild(inputPrice);


            // CREATE, APPEND "total amount" <LABEL>
            var labelTotalAmount = document.createElement('label');
            labelTotalAmount.appendChild(document.createTextNode('Total Amount'));
            selectedItemsWrap.appendChild(labelTotalAmount);
            // CREATE, APPEND "total amount" <INPUT>
            var inputTotalAmount = document.createElement('input');
            inputTotalAmount.type = "text";
            inputTotalAmount.id = 'totalAmount' + i;
            inputTotalAmount.name="totalAmount";
            selectedItemsWrap.appendChild(inputTotalAmount);

            
        }
        
       
    }
      
    // CREATE, APPEND "sum amount" <LABEL>
    var labelsumAmount=document.createElement('label');
    labelsumAmount.appendChild(document.createTextNode('Sum Amount'));
    selectedItemsWrap.appendChild(labelsumAmount);
    
    // CREATE, APPEND "sum amount" <INPUT>
    var inputSumAmount = document.createElement('input');
    inputSumAmount.type = "text";
    inputSumAmount.id = 'sumAmount';
    inputSumAmount.name="sumAmount";
    selectedItemsWrap.appendChild(inputSumAmount);
         var brforservicetax = document.createElement("br");
         selectedItemsWrap.appendChild(brforservicetax);
    
    // CREATE, APPEND "Service Tax " <LABEL>
    var labelServiceTax=document.createElement('label');
    labelServiceTax.appendChild(document.createTextNode('Service Tax'));
    selectedItemsWrap.appendChild(labelServiceTax);
    
    // CREATE, APPEND "Service Tax " <INPUT>
    var inputServiceTax = document.createElement('input');
    inputServiceTax.type = "text";
    inputServiceTax.id = 'servicetax';
    inputServiceTax.name="servicetax";
//     inputServiceTax.setAttribute("onblur", "serviceTaxCalc()");
    selectedItemsWrap.appendChild(inputServiceTax);
    
    
    
 // CREATE, APPEND "VAT Tax " <LABEL>
    var labelVATTax=document.createElement('label');
    labelVATTax.appendChild(document.createTextNode('VAT Tax'));
    selectedItemsWrap.appendChild(labelVATTax);
    
    // CREATE, APPEND "VAT Tax " <INPUT>
    var inputVATTax = document.createElement('input');
    inputVATTax.type = "text";
    inputVATTax.id = 'vattax';
    inputVATTax.name="vattax";

//     inputVATTax.setAttribute("onblur", "serviceTaxCalc()");
    selectedItemsWrap.appendChild(inputVATTax);
    
    
 // CREATE, APPEND "LBT Tax " <LABEL>
    var labelLBTTax=document.createElement('label');
    labelLBTTax.appendChild(document.createTextNode('LBT Tax'));
    selectedItemsWrap.appendChild(labelLBTTax);
    
    // CREATE, APPEND "LBT Tax " <INPUT>
    var inputLBTTax = document.createElement('input');
    inputLBTTax.type = "text";
    inputLBTTax.id = 'lbttax';
    inputLBTTax.name="lbttax";
    inputLBTTax.setAttribute("onblur", "serviceTaxCalc()");
    selectedItemsWrap.appendChild(inputLBTTax);
    
    
 // CREATE, APPEND " Tax AMOUNT " <LABEL>
    var labelTaxAmount=document.createElement('label');
    labelTaxAmount.appendChild(document.createTextNode('Tax Amount'));
    selectedItemsWrap.appendChild(labelTaxAmount);
    
    // CREATE, APPEND " Tax  Amount" <INPUT>
    var inputTaxAmount = document.createElement('input');
    inputTaxAmount.type = "text";
    inputTaxAmount.id = 'taxamount';
    inputTaxAmount.name="taxamount";
    selectedItemsWrap.appendChild(inputTaxAmount);
    
    
 // CREATE, APPEND " Grand Total " <LABEL>
    var labelGrandTotal=document.createElement('label');
    labelGrandTotal.appendChild(document.createTextNode('Grand Total'));
    selectedItemsWrap.appendChild(labelGrandTotal);
    
    // CREATE, APPEND " Grand  Amount" <INPUT>
    var inputGrandTotal = document.createElement('input');
    inputGrandTotal.type = "text";
    inputGrandTotal.id = 'grandamount';
    inputGrandTotal.name="grandamount";
    selectedItemsWrap.appendChild(inputGrandTotal);
   
}


function singleProdAmountCalc(rowNumber) {
	var quantity = document.getElementById("quantity" + rowNumber);
	var price = document.getElementById("price" + rowNumber);
	var totalAmount = document.getElementById("totalAmount" + rowNumber);
	var sum=document.getElementById("sumAmount");
	if(!isNaN(quantity.value) && !isNaN(price.value)){
		totalAmount.value = quantity.value * price.value;
		sum.value=+(totalAmount.value) +  +(document.getElementById("sumAmount").value) ;
		alert(sum.value);
		alert(quantity * price);
	}
}
 function serviceTaxCalc()
 {
	 alert("hihi");
	 var serviceTax=document.getElementById("servicetax");
	 alert(serviceTax.value);
	 var vattax=document.getElementById("vattax");
	 alert(vattax.value);
	 var lbttax=document.getElementById("lbttax");
	   alert(lbttax.value);
	    var grandamount=document.getElementById("grandamount");
		var sum=document.getElementById("sumAmount");
    var taxamount=document.getElementById("taxamount");
	 var sumAmount = document.getElementById("sumAmount");
	 alert(sumAmount.value);
		 taxamount.value=((serviceTax.value)/100)*sumAmount.value+(((vattax.value)/100)*sumAmount.value)+(((lbttax.value)/100)*sumAmount.value);
		 grandamount.value=+(taxamount.value)+ +(sum.value);
		 alert(grandamount.value);
		 alert(taxamount.value);
    	 
 }

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
 
  <c:if test="${not empty Message}">
  
  <table>
    <tr>
    <td>
      <input type="hidden" name="vendorId" value="${vendorId}">
    </td>
    </tr>
  
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
      
    City <input id="city" type="text" name="city" value="${city}">
        </td></tr>
         <tr>
       <td>
      
    State<input id="state" type="text" name="state"  value="${state }">
        </td></tr>
        
         
        
  </table>
  </c:if>
  </form>
  <form action="selectedproductrecord" name="selectproduct" method="post" id="selectedproductrecord">
  <table>
  
  <tr>
   <td>
   <input type="hidden" id="vendorName" name="vendorName" value="${vendorname}">
      <input type="hidden" id="mobileno" name="mobileno" value="${mobileno}">
      <input type="hidden" id="telephoneno" name="telephoneno" value="${telephoneno}">
            <input type="hidden" id="website" name="website" value="${website}">
            <input type="hidden" id="email" name="email" value="${email}">
            <input type="hidden" id="address" name="address" value="${address}">
            <input type="hidden" id="zipcode" name="zipcode" value="${zipcode}">
            <input type="hidden" id="country" name="country" value="${country}">
            <input type="hidden" id="state" name="state" value="${state}">
             <input type="hidden" id="city" name="city" value="${city}">
             <input type="hidden" id="productId" name="productId" value="${productId}">
             
   </td>
   </tr>
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
  <select name="productname" id="productname" multiple="multiple">
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
  <div id="selectedItemsWrap" style="display:none">
   <b>You selected items:</b>
       <span id="Values"></span>
       <input type="submit" value="Save" >
       <input type="submit" value="Cancel">
       </div>
  </form>
</body>
</html>