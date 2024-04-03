package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

  // Other case, the most common
  // @RequestMapping(value={"", "/", "/regards"}, method=RequestMethod.GET)
  // public String hello(Model model) {
  //   model.addAttribute("title", "Spring Boot");
  //   model.addAttribute("regards", "Hey from spring boot!");
  //   return "hello";
  // }
}
