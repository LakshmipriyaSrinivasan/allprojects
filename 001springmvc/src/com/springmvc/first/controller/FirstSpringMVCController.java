package com.springmvc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@RequestMapping("/message")
	public String sendMessage(Model m) {
		m.addAttribute("myMessage","Hello from Spring MVC Model");
		return "kitchen";
	}
	@RequestMapping("/supermessage")
	public ModelAndView sendsuperMessage(ModelAndView mv) {
		mv.addObject("food","hiiii");
		mv.setViewName("canteen");
		return mv;
	}
}
