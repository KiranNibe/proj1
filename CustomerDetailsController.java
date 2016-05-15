package com.ims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
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
import com.ims.service.CustomerDetailsService;

@Controller
public class CustomerDetailsController {

	@Autowired
	CustomerDetailsService customerDetailsService;

	@RequestMapping(value = "/addcustomerpage", method = RequestMethod.GET)
	public String addCustomerPage(ModelMap model, HttpServletRequest request) {
		return "addcustomerdetails";
	}

	@RequestMapping(value = "/showcustomerListpage", method = RequestMethod.GET)
	public String showCustomerListPage(ModelMap model, HttpServletRequest request) {
		return "customerdetailslist";
	}

	@RequestMapping(value = "/addcustomerdetails", method = RequestMethod.POST)
	public String addCustomerDetails(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,
			@RequestParam("customername") String cutomerName, @RequestParam("mobileno") String mobileNo,
			@RequestParam("telephoneno") String telePhoneNo, @RequestParam("address") String address,
			@RequestParam("email") String email, @RequestParam("country") String country,
			@RequestParam("state") String state, @RequestParam("city") String city,
			@RequestParam("zipcode") String zipcode) {

		if (request.getParameter("Cancel") != null) {
			return "home";
		} else {
			ModelAndView modelAndView = new ModelAndView("addcustomerdetails");
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCustomerName(cutomerName);
			customerDetails.setMobile(mobileNo);
			customerDetails.setTelePhoneNo(telePhoneNo);
			customerDetails.setAddress(address);
			customerDetails.setEmail(email);
			customerDetails.setCountry(country);
			customerDetails.setState(state);
			customerDetails.setCity(city);
			customerDetails.setZipCode(zipcode);
			customerDetails.setStatus(1);
			customerDetails = customerDetailsService.addcustomerDetails(customerDetails);
			model.addAttribute("customerDetails", customerDetails);
			if (customerDetails != null) {
				session.setAttribute("message", " 1");
				session.setAttribute("customerDetails", "customerDetails");
			} else
				session.setAttribute("message", "0");
			return "home";
		}

	}

	@RequestMapping(value = "/customerdetailslist", method = RequestMethod.GET)
	public String customerDetailsList(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("customerdetailslist");
		List<CustomerDetails> CustomerDetailsList = customerDetailsService.listCustomerDetails();
		modelMap.put("customerList", CustomerDetailsList);
		return "customerdetailslist";

	}

	@RequestMapping(value = "/updatecustomerdeatilslist", method = RequestMethod.GET)
	public String updateProductPage(ModelMap model, HttpServletRequest request) {
		return "updatecustomerdetailslist";
	}

	@RequestMapping(value = "/updatecustomerdetails", method = RequestMethod.GET)
	public String updateCustomerDetails(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session, @RequestParam("customerId") int customerId) {
		ModelAndView modelAndView = new ModelAndView("updatecustomerdetails");
		System.out.println("customerId are===>" + customerId);
		int status = 1;
		CustomerDetails customerDetails = customerDetailsService.updateCustomerDetails(customerId, status);
		session.setAttribute("message", " 1");
		modelMap.put("status", customerDetails.getStatus());
		modelMap.put("customerDetails", customerDetails);
		return "updatecustomerdetailslist";
	}

	@RequestMapping(value = "/updateselectedcustomerdetails", method = RequestMethod.GET)
	public String updateCustomerDetails(ModelMap modelMap, Model model, HttpServletRequest request,
			HttpServletResponse response, HttpSession session, @RequestParam("customerId") String customerId,
			@RequestParam("customerName") String customerName, @RequestParam("mobile") String mobileNo,
			@RequestParam("telePhoneNo") String telephoneNo, @RequestParam("email") String email,
			@RequestParam("address") String address, @RequestParam("zipCode") String zipCode,
			@RequestParam("country") String country, @RequestParam("state") String state,
			@RequestParam("city") String city) {
		System.out.println("customerId is===>" + customerId);
		int status = 1;
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAddress(address);
		customerDetails.setCity(city);
		customerDetails.setCountry(country);
		customerDetails.setCustomerId(Integer.parseInt(customerId));
		customerDetails.setCustomerName(customerName);
		customerDetails.setEmail(email);
		customerDetails.setMobile(mobileNo);
		customerDetails.setState(state);
		customerDetails.setStatus(status);
		customerDetails.setTelePhoneNo(telephoneNo);
		customerDetails.setZipCode(zipCode);
		customerDetails = customerDetailsService.updateCustomerDetails(customerDetails);
		session.setAttribute("message", " 1");
		modelMap.put("status", customerDetails.getStatus());
		modelMap.put("customerDetails", customerDetails);
		return "customerdetailslist";
	}

	@RequestMapping(value = "/deletecustomerdetails", method = RequestMethod.GET)
	public String deleteProductDeatils(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final RedirectAttributes redirectAttributes,
			@RequestParam("customerId") String customerId) {
		System.out.println("customerId are===>" + customerId);
		Boolean returnValue = customerDetailsService.deleteCustomerDeatils(customerId);
		if (returnValue == true)
			session.setAttribute("message", " 1");
		model.put("status", 0);

		return "customerdetailslist";
	}

}
