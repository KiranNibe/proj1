/**
 * 
 */
function addInput(divName,productDetailsList){
          var newdiv = document.createElement('div');
          var product=document.getElementsByName('productname');
          var newOption = document.createElement('product');
         newdiv.innerHTML = "productName" + " <br><select name='productname' id='productname'>product<option>select Product</option> " +
          		"" +
          		'<c:forEach items="${productDetailsList}" var="productname">'+""+ 
          		'<option value="${productname1.productName}" ${productname1.productName == productName}>product</option>' +"<br>"
          +"quantity " + 
          " <br><input type='text' name='quantity'>"+" <br> purchaseprice " + " <br><input type='text' name='purchaseprice'>"+" <br> totalamount" + " <br><input type='text' name='totalamount'>";
//          newdiv.innerHTML = "purchaseprice " + " <br><input type='text' name='purchaseprice'>";
//          newdiv.innerHTML = "totalamount " + " <br><input type='text' name='totalamount'>";
          document.getElementById(divName).appendChild(newdiv);
          
     
}