package com.myapplications.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloUserController {

	@RequestMapping("/")
	public String welcomePage()	{
		return "welcome";
	}
	
	@RequestMapping("/homepage")
	public String homepage()	{
		return "homepage";
	}
	
	@RequestMapping("processForm")
	public String processForm()	{
		return "helloUser";
	}
	
	@RequestMapping("shoutAtUser")
	public String shoutAtUser(HttpServletRequest servletRequest, Model model)	{
		
		// Step - 1: Reading User data from servletRequest
		String userName = servletRequest.getParameter("userName");
		
		// Step - 2: Manipulating User data to all caps
		userName = userName.toUpperCase();
		
		// Step - 3: Creating a message from User data
		
		String message = "Shouting at " + userName;
		
		// Step - 4: Adding the message to Model Class
		
		model.addAttribute("shoutAtUser", message);
		
		return "shoutAtUser";
	}
}