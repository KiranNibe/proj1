package com.ims.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ims.service.LoginService;

@Controller
public class LoginController {
	@Autowired 
	LoginService loginService;
	


	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String userCheck(ModelMap model, HttpServletRequest request) {
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		 boolean isTrue=false;
		  isTrue=loginService.login(name,pwd);
		if(isTrue)
			model.addAttribute("message", "Successfully logged in.");
			
		else{
			model.addAttribute("message", "Username or password is wrong.");
		}
	      	return "/home";
	}
	 
}
