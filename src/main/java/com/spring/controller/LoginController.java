package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController
{
		@RequestMapping(value="/index.action",method=RequestMethod.GET)
		public ModelAndView signup(HttpServletRequest request, HttpServletResponse response)
		{
			LoginBean loginBean=new  LoginBean();
			loginBean.setPassword("aa");
			loginBean.setUsername("bb");
			ModelAndView model = new ModelAndView("login");
			model.addObject("loginBean", loginBean);
			request.setAttribute("message", "Login ");
			request.setAttribute("msg", "Sign Up ");
			return model;
		}
		
		
		
		@RequestMapping(value="/signupp",method=RequestMethod.GET)
		   public ModelAndView sign(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		   {
		     ModelAndView model = new ModelAndView("login");
		     //LoginBean loginBean = new LoginBean();
		     model.addObject("loginBean", loginBean);
		   
		     request.setAttribute("message", "Sign Up ");
		     
		     
		     return model;
		   }
		
		
		@RequestMapping(value="/mainpage",method=RequestMethod.POST)
		   public ModelAndView main(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		   {
		     
			
			ModelAndView model = new ModelAndView("mainpage");
			model.addObject("mainpage", loginBean);
			return model;

			
		     
		   }
		

		
		
		
	
}
