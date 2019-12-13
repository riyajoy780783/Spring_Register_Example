package com.naveen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.model.Login;
import com.naveen.model.User;
import com.naveen.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	public ModelAndView showhome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value ="/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginprocess(HttpServletRequest request, HttpServletResponse response, Login loginn) {
		ModelAndView mav = null;
		
		User user = userservice.validateUser(loginn);
		
		if(null != user) {
			
			mav = new ModelAndView("welcome");
			mav.addObject("firstname",user.getFirstname());
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("messege", "Username or Password is wrong!!");
		}
			
		return mav;	
		
		
	}

}
