package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

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
  public String user(Model model) {
    User user = new User();
    user.setName("John");
    user.setLastName("Doe");
    user.setEmail("john.doe@mail.com");
    
    model.addAttribute("title", "Profile");
    model.addAttribute("user", user);
    return "profile";
  }

  @RequestMapping(value={"/users"}, method=RequestMethod.GET)
  public String users(Model model) {
    List<User> users = new ArrayList<>();
    users.add(new User("John", "Doe", "john.doe@mail.com"));
    users.add(new User("Melf", "Zue", "melf.zue@mail.com"));
    users.add(new User("Carl", "Dolf", "carl.dolf@mail.com"));
    
    model.addAttribute("title", "Users");
    model.addAttribute("users", users);
    return "users";
  }
}
