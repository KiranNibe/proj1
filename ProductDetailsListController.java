package com.ims.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ims.model.ProductDetails;
import com.ims.service.ProductDetailsListService;
import com.ims.service.ProductDetailsService;

@Controller
public class ProductDetailsListController {

//	@Autowired
//	ProductDetailsListService productDetailsListService;
//
//	@RequestMapping(value = "/showproductlistpage", method = RequestMethod.GET)
//	public String addProductPage(ModelMap model, HttpServletRequest request) {
//		return "productdetailslist";
//	}
//
//	@RequestMapping(value = "/productdetailslist", method = RequestMethod.GET)
//	public String productDetailsList(ModelMap modelMap, Model model, HttpServletRequest request,
//			HttpServletResponse response, HttpSession session, final RedirectAttributes redirectAttributes) {
//		ModelAndView modelAndView = new ModelAndView("productdetailslist");
//		PagedListHolder<ProductDetails> pagedListHolder = null;
//		List<ProductDetails> productDetailsList = productDetailsListService.listProductDetails();
//		pagedListHolder = new PagedListHolder<>(productDetailsList);
//		modelMap.addAttribute("productList", productDetailsList);
//		session.setAttribute("productList", productDetailsList);
//		modelMap.put("productList", productDetailsList);
//		session.setAttribute("productList1", productDetailsList);
//		model.addAttribute("productList1", productDetailsList);
//		return "productdetailslist";
//
//	}
}
