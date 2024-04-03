package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.User;

@Controller
@RequestMapping("/app")
public class DemoController {
  @RequestMapping(value={"", "/", "/regards"}, method=RequestMethod.GET)
  public ModelAndView hello(ModelAndView mv) {
    mv.addObject("title", "Spring Boot");
    mv.addObject("regards", "Hey from spring boot!");
    mv.setViewName("hello");
    return mv;
  }

  // Other case, is the same and the most common
  @RequestMapping(value={"/user"}, method=RequestMethod.GET)
  public String hello(Model model) {
    User user = new User();
    user.setName("John");
    user.setLastName("Doe");
    
    model.addAttribute("title", "Profile");
    model.addAttribute("user", user);
    return "profile";
  }
}
