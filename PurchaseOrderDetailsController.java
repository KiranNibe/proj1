package com.ims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;
import com.ims.service.ProductDetailsService;
import com.ims.service.PurchaseOrderDetailsService;
import com.ims.service.VendorDetailsService;

@Controller
public class PurchaseOrderDetailsController {
	
	@Autowired
	  PurchaseOrderDetailsService  purchaseOrderDetailsService;
      @Autowired
	  VendorDetailsService vendorDetailsService;
	  @Autowired
     ProductDetailsService productDetailsService;	
	
	@RequestMapping(value = "/showpurchaseorderpage", method = RequestMethod.GET)
	public String showPurchaseOrderPage(ModelMap modelMap, HttpServletRequest request) {
		List<VendorDetails>  vendorDetailsList=vendorDetailsService.listVendorDetails();
		String message;
		modelMap.put("vendorDetailsList", vendorDetailsList);
	    message="";
		modelMap.put("Message", message);
		List<ProductDetails> productDetailsList=productDetailsService.listProductDetails();
		modelMap.put("productDetailsList", productDetailsList);
		return "purchaseorderdetails";
		
	}

	
	
	@RequestMapping(value="/selectedvendorrecord",method=RequestMethod.POST)
	public String getSelectedVendorRecord(ModelMap modelMap, HttpSession session,HttpServletRequest request,@RequestParam ("vendorname") String vendorName)
	{
		VendorDetails vendorDetails=new VendorDetails();
		String message;
		List<VendorDetails>  vendorDetailsList=vendorDetailsService.listVendorDetails();
		modelMap.put("vendorDetailsList", vendorDetailsList);
		List<ProductDetails> productDetailsList=productDetailsService.listProductDetails();
		modelMap.put("productDetailsList", productDetailsList);
		vendorDetails=purchaseOrderDetailsService.getSelectedVendorRecord(vendorName);
		if(!(vendorDetailsList.isEmpty()))
			   message="true";
			else
				message="";
			modelMap.put("Message", message);
//	    request.setAttribute("Message", message);
		modelMap.put("mobileno", vendorDetails.getMobileNo());
		modelMap.put("vendorId",vendorDetails.getVendorId());
		modelMap.put("telephoneno", vendorDetails.getPhoneNo());
		modelMap.put("website", vendorDetails.getWebsite());
		modelMap.put("email", vendorDetails.getEmail());
		modelMap.put("address", vendorDetails.getAddress());
		modelMap.put("zipcode", vendorDetails.getZipCode());
		modelMap.put("city", vendorDetails.getCity());
		modelMap.put("state", vendorDetails.getState());
		modelMap.put("country", vendorDetails.getCountry());
		modelMap.put("vendorname", vendorName);
		modelMap.put("vendorDetailsList1", vendorDetails);
		return "purchaseorderdetails";
	}
	
	@RequestMapping(value="/selectedAmount",method=RequestMethod.POST)
	 public String getSelectedAmount(ModelMap modelMap, HttpSession session,HttpServletRequest request,@RequestParam ("quantity") String quantity,
			 @RequestParam("purchaseprice") String purchaseprice,@RequestParam ("vendorname") String vendorName,@RequestParam ("productname") String productName,
			 @RequestParam("orderNo") String orderNo,@RequestParam("purchaseDate") String purchaseDate,
				@RequestParam("remark") String remark)
	 {
		 VendorDetails vendorDetails=new VendorDetails();
		 ProductDetails productDetails=new ProductDetails();
		 vendorDetails=purchaseOrderDetailsService.getSelectedVendorRecord(vendorName);
		 productDetails=purchaseOrderDetailsService.getSelectedProductRecord(productName);
        String message="true";
		Integer quantity1=Integer.parseInt(quantity);
		double  purchaseprice1=Double.parseDouble(purchaseprice);
		 double totalamount=quantity1*purchaseprice1;
		 List<VendorDetails>  vendorDetailsList=vendorDetailsService.listVendorDetails();
			modelMap.put("vendorDetailsList", vendorDetailsList);
			List<ProductDetails> productDetailsList=productDetailsService.listProductDetails();
			modelMap.put("productDetailsList", productDetailsList);
		  modelMap.put("totalamount", totalamount);
		  modelMap.put("quantity", quantity);
		  modelMap.put("purchaseprice", purchaseprice);
		  modelMap.put("Message", message);
		  modelMap.put("productName", productName);
			modelMap.put("productname", productDetails.getProductName());
			modelMap.put("quantity", productDetails.getWarningQuantity());
			modelMap.put("salePrice", productDetails.getSalePrice());
			modelMap.put("description", productDetails.getDescription());
			modelMap.put("productId", productDetails.getProductId());
			modelMap.put("vendorName", productDetails.getVendorName());
			modelMap.put("status", productDetails.getStatus());
			modelMap.put("mobileno", vendorDetails.getMobileNo());
			modelMap.put("telephoneno", vendorDetails.getPhoneNo());
			modelMap.put("website", vendorDetails.getWebsite());
			modelMap.put("email", vendorDetails.getEmail());
			modelMap.put("address", vendorDetails.getAddress());
			modelMap.put("zipcode", vendorDetails.getZipCode());
			modelMap.put("city", vendorDetails.getCity());
			modelMap.put("state", vendorDetails.getState());
			modelMap.put("country", vendorDetails.getCountry());
			modelMap.put("vendorname", vendorName);
			modelMap.put("orderNo", orderNo);
			modelMap.put("purchaseDate", purchaseDate);
			modelMap.put("remark", remark);
		  
		return "purchaseorderdetails";
		
	 }
	@RequestMapping(value="/selectedproductrecord",method=RequestMethod.POST)
	public String getSelectedProductRecord(ModelMap modelMap, HttpSession session,HttpServletRequest request,@RequestParam ("productname") String productName,
			@RequestParam ("vendorName") String vendorName,@RequestParam("orderNo") String orderNo,@RequestParam("purchaseDate") String purchaseDate,
			@RequestParam("remark") String remark,
			@RequestParam("quantity") String []quantity,
			@RequestParam("totalAmount") String []totalAmount,
			@RequestParam("price") String []price,
			@RequestParam("servicetax") String serviceTax,
			@RequestParam("vattax") String vatTax,
			@RequestParam("sumAmount") String sumAmount,
			@RequestParam("grandamount") String grandAmount,
			@RequestParam("taxamount") String []taxAmount,
			@RequestParam("lbttax") String lbtTax
		)
	{
		ProductDetails productDetails=new ProductDetails();
		VendorDetails vendorDetails=new VendorDetails();
		String message;
		List<ProductDetails> productDetailsList=productDetailsService.listProductDetails();
		modelMap.put("productDetailsList", productDetailsList);
		List<VendorDetails>  vendorDetailsList=vendorDetailsService.listVendorDetails();
		modelMap.put("vendorDetailsList", vendorDetailsList);
		 for(int i=0;i<quantity.length;i++)
		     System.out.println(quantity[i]);
		String productNameArray[]=productName.split(",");
		  for(int i=0;i<productNameArray.length;i++)
			     System.out.println(productNameArray[i]);
		 productDetails=purchaseOrderDetailsService.getSelectedProductRecord(productName);
		 vendorDetails=purchaseOrderDetailsService.getSelectedVendorRecord(vendorName);
		 if(!(productDetailsList.isEmpty()))
			     message="true";
		 else
			 message="";
			modelMap.put("Message", message);
			modelMap.put("productName", productName);
			modelMap.put("productname", productDetails.getProductName());
			modelMap.put("quantity", productDetails.getWarningQuantity());
			modelMap.put("salePrice", productDetails.getSalePrice());
			modelMap.put("description", productDetails.getDescription());
			modelMap.put("productId", productDetails.getProductId());
			modelMap.put("vendorName", productDetails.getVendorName());
			modelMap.put("status", productDetails.getStatus());
			modelMap.put("mobileno", vendorDetails.getMobileNo());
			modelMap.put("telephoneno", vendorDetails.getPhoneNo());
			modelMap.put("website", vendorDetails.getWebsite());
			modelMap.put("email", vendorDetails.getEmail());
			modelMap.put("address", vendorDetails.getAddress());
			modelMap.put("zipcode", vendorDetails.getZipCode());
			modelMap.put("city", vendorDetails.getCity());
			modelMap.put("state", vendorDetails.getState());
			modelMap.put("country", vendorDetails.getCountry());
			modelMap.put("vendorname", vendorName);
			modelMap.put("orderNo", orderNo);
			modelMap.put("purchaseDate", purchaseDate);
			modelMap.put("remark", remark);
			
			
			
		return "purchaseorderdetails";
		
	}
	
}
