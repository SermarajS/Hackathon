package com.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, ModelMap model) {
        String greet = "Hello!!! " + name + " How are You?";
        //logger.info(greet);
        System.out.println(greet);
        return "greet";
    }
    
    @RequestMapping("/test")
    public ModelAndView Test() {
    	return new ModelAndView("greet");
    }
    
    @GetMapping("/test2")
    public String Test2() {
    	return ("greet");
    }
    
    @RequestMapping("/")
    public ModelAndView myIndex() {
    	return new ModelAndView("greet");
    }

}
