package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KitchenController {
	
	@RequestMapping("/")
	public String chef1()
	{
		return "home.jsp";
	}

	@RequestMapping("userlogin")
	public String chef2()
	{		return "login.jsp";
	}
 
	
}
