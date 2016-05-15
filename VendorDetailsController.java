package com.ims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ims.model.CustomerDetails;
import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;
import com.ims.service.VendorDetailsService;

@Controller
public class VendorDetailsController {
	
	@Autowired
	VendorDetailsService vendorDetailsService;
	@RequestMapping(value = "/addvendorpage", method = RequestMethod.GET)
	public String addCustomerPage(ModelMap model, HttpServletRequest request) {
		return "addvendordetails";
	}
	

	@RequestMapping(value = "/showvendorListpage", method = RequestMethod.GET)
	public String showCustomerListPage(ModelMap model, HttpServletRequest request) {
		return "vendordetailslist";
	}
	
	
	
	@RequestMapping(value = "/addvendordetails", method = RequestMethod.POST)
	public String addVendorDetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,
			@RequestParam("vendorname") String cutomerName, @RequestParam("mobileno") String mobileNo,
			@RequestParam("telephoneno") String telePhoneNo, @RequestParam("address") String address,
			@RequestParam("email") String email, @RequestParam("country") String country,
			@RequestParam("state") String state, @RequestParam("city") String city,@RequestParam("website") String website,
			@RequestParam("zipcode") String zipcode) {

		if (request.getParameter("Cancel") != null) {
			return "home";
		} else {
			ModelAndView modelAndView = new ModelAndView("addvendordetails");
			VendorDetails vendorDetails = new VendorDetails();
			vendorDetails.setVendorName(cutomerName);
			vendorDetails.setMobileNo(mobileNo);
			vendorDetails.setPhoneNo(telePhoneNo);
			vendorDetails.setAddress(address);
			vendorDetails.setEmail(email);
			vendorDetails.setCountry(country);
			vendorDetails.setState(state);
			vendorDetails.setCity(city);
			vendorDetails.setZipCode(zipcode);
			vendorDetails.setStatus(1);
			vendorDetails.setWebsite(website);
			vendorDetails = vendorDetailsService.addVendorDetails(vendorDetails);
			model.addAttribute("vendorDetails", vendorDetails);
			if (vendorDetails != null) {
				session.setAttribute("message", " 1");
				session.setAttribute("vendorDetails", "vendorDetails");
			} else
				session.setAttribute("message", "0");
			return "home";
		}
	}
	@RequestMapping(value = "/vendordetailslist", method = RequestMethod.GET)
	public String vendorDetailsList(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		List<VendorDetails> vendorDetailsList = vendorDetailsService.listVendorDetails();
		modelMap.put("vendorDetailsList", vendorDetailsList);
		return "vendordetailslist";

	}
	
	@RequestMapping(value = "/updatevendordetailslist", method = RequestMethod.GET)
	public String updateProductPage(ModelMap model, HttpServletRequest request) {
		return "updatevendordetailslist";
	}
	
	
	@RequestMapping(value = "/updatevendordetails", method = RequestMethod.GET)
	public String updateProductDetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,@RequestParam("vendorId")String vendorId) {
			System.out.println("vendorId are===>"+vendorId);
			int status=1;
			 
			VendorDetails vendorDetails = vendorDetailsService.updateVendorDetails(Long.parseLong(vendorId),status);
				session.setAttribute("message", " 1");
				         model.put("status",vendorDetails.getStatus());
     				     model.put("vendorDetails",vendorDetails);
     				     session.setAttribute("vendorDetails",vendorDetails);
			return "updatevendordetailslist";
	}
	@RequestMapping(value="/updateselectedvendordetails",method=RequestMethod.GET)
	public String updateVendorDetails(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session,@RequestParam("vendorId") String vendorId,
			@RequestParam("vendorName") String vendorName,
			@RequestParam("mobileNo") String mobileNo,
			@RequestParam("phoneNo") String telephoneNo,
			@RequestParam("website") String website,
			@RequestParam("email") String email,
			@RequestParam("address") String address,
			@RequestParam("zipCode") String zipCode,
			@RequestParam("country") String country,
			@RequestParam("state") String state,
			@RequestParam("city") String city
			)
	{
		System.out.println("vendorId is===>"+vendorId);
		int status=1;
		 VendorDetails vendorDetails=new VendorDetails();
		 vendorDetails.setVendorId(Long.parseLong(vendorId));
		 vendorDetails.setVendorName(vendorName);
		 vendorDetails.setAddress(address);
		 vendorDetails.setCity(city);
		 vendorDetails.setWebsite(website);
		 vendorDetails.setCountry(country);
		 vendorDetails.setEmail(email);
  vendorDetails.setMobileNo(mobileNo);
vendorDetails.setPhoneNo(telephoneNo);
vendorDetails.setState(state);
vendorDetails.setStatus(status);
vendorDetails.setZipCode(zipCode);
		
		
		 vendorDetails = vendorDetailsService.updateVendorDetails(vendorDetails);
			session.setAttribute("message", " 1");
			modelMap.put("status",vendorDetails.getStatus());
			modelMap.put("vendorDetails",vendorDetails);
		return "vendordetailslist";
}
	@RequestMapping(value = "/deletevendordetails", method = RequestMethod.GET)
	public String deleteProductDeatils(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,@RequestParam("vendorId")String vendorId) {
			System.out.println("vendorId are===>"+vendorId);
			Boolean returnValue=vendorDetailsService.deleteVendorDetails(vendorId);
				if(returnValue==true)
			   session.setAttribute("message", " 1");
				 model.put("status",0);
				 
			return "vendordetailslist";
	}
	
	

}
