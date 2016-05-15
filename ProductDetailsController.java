package com.ims.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ims.service.LoginService;
import com.ims.service.ProductDetailsService;
import com.ims.model.ProductDetails;;

@Controller
public class ProductDetailsController implements Serializable{

	@Autowired
	ProductDetailsService productDetailsService;

	@RequestMapping(value = "/addproductpage", method = RequestMethod.GET)
	public String addProductPage(ModelMap model, HttpServletRequest request) {
		return "addproductdetails";
	}

	@RequestMapping(value = "/updateproductdeatilslist", method = RequestMethod.GET)
	public String updateProductPage(ModelMap model, HttpServletRequest request) {
		return "updateproductdetailslist";
	}

	@RequestMapping(value = "/saveproductdetails", method = RequestMethod.POST)
	public String addProductDetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes) {

		if (request.getParameter("Cancel") != null) {
			return "home";
		} else {
			ModelAndView modelAndView = new ModelAndView("addproductdetails");
			ProductDetails productDetails = new ProductDetails();
			productDetails.setDescription(request.getParameter("productdescription"));
			productDetails.setProductName(request.getParameter("productname"));
			productDetails.setVendorName(request.getParameter("vendorname"));
			productDetails.setWarningQuantity(Integer.valueOf(request.getParameter("warningquantity")));
			productDetails.setSalePrice(Double.valueOf(request.getParameter("saleprice")));
			productDetails.setDescription(request.getParameter("productdescription"));
//			productDetails.setStatus(Integer.parseInt(request.getParameter("status")));
			productDetails = productDetailsService.addProductDetails(productDetails);
			model.addAttribute("productDetails", productDetails);
			if (productDetails != null) {
				session.setAttribute("message", " 1");
				session.setAttribute("productDetails", "productDetails");
			} else
				session.setAttribute("message", "0");
			return "home";
		}

	}

	@RequestMapping(value = "/updateproductdetails", method = RequestMethod.GET)
	public String updateProductDetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,@RequestParam("productId")String productId) {
			ModelAndView modelAndView = new ModelAndView("updateproductdetailslist");
			System.out.println("productId are===>"+productId);
			int status=1;
			ProductDetails productDetails1=new ProductDetails();
			ProductDetails productDetails = productDetailsService.updateProductDetails(productId,status);
				session.setAttribute("message", " 1");
				         model.put("status",productDetails.getStatus());
     				     model.put("productDetails",productDetails);
     				     session.setAttribute("productDetails",productDetails);
			return "updateproductdetailslist";
	}
	
	
	
	
	@RequestMapping(value = "/deleteproductdeatils", method = RequestMethod.GET)
	public String deleteProductDeatils(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,@RequestParam("productId")String productId) {
			ModelAndView modelAndView = new ModelAndView("updateproductdetailslist");
			System.out.println("productId are===>"+productId);
			ProductDetails productDetails1=new ProductDetails();
			Boolean returnValue=productDetailsService.deleteProductDeatils(productId);
				if(returnValue==true)
			   session.setAttribute("message", " 1");
				 model.put("status",0);
				 
			return "updateproductdetailslist";
	}
	
	
	
	@RequestMapping(value = "/updateselectedproductdetails", method = RequestMethod.GET)
	public String updateselectedproductdetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,@RequestParam("productId")String productId,@RequestParam("quantity") int quantity,
			@RequestParam("productname") String productName,
			@RequestParam("vendorname") String vendorName,
			@RequestParam("saleprice") double salePrice,
			@RequestParam("productdescription") String productDescription
//			@RequestParam("status") int status
			) {
			ModelAndView modelAndView = new ModelAndView("updateproductdetailslist");
			System.out.println("productId are===>"+productId);
			if(request.getParameter("Update").equalsIgnoreCase("Update"))
			{
			   ProductDetails productDetails=new ProductDetails();
			   productDetails.setProductId(Integer.parseInt(productId));
			   productDetails.setProductName(productName);
			   productDetails.setWarningQuantity(quantity);
               productDetails.setSalePrice(salePrice);
               productDetails.setDescription(productDescription);
               productDetails.setVendorName(vendorName);
               productDetails.setStatus(1);
			   ProductDetails productDetails1 = productDetailsService.updateselectedproductdetails(productDetails);
			   session.setAttribute("message", " 1");
     		   model.put("productDetails",productDetails1);
     		   session.setAttribute("productDetails",productDetails1);
			}
			else
			{
				return "productdetailslist";
			}
     		   
			
			return "updateproductdetailslist";
		
	}
	@RequestMapping(value = "/showproductlistpage", method = RequestMethod.GET)
	public String showProductPage(ModelMap model, HttpServletRequest request) {
		
		
		return "productdetailslist";
	}

	@RequestMapping(value = "/productdetailslist", method = RequestMethod.GET)
	public String productDetailsList(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session, final RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("productdetailslist");
		PagedListHolder<ProductDetails> pagedListHolder = null;
		List<ProductDetails> productDetailsList = productDetailsService.listProductDetails();
		pagedListHolder = new PagedListHolder<>(productDetailsList);
		modelMap.addAttribute("productList", productDetailsList);
		session.setAttribute("productList", productDetailsList);
		modelMap.put("productList", productDetailsList);
		session.setAttribute("productList1", productDetailsList);
		model.addAttribute("productList1", productDetailsList);
		return "productdetailslist";

	}
	
	
	
}
