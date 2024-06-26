package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path-parameters")
public class PathParametersController {
  @GetMapping("")
  public String list(Model model) {
    model.addAttribute("title", "List to Path Parameters");
    return "path-parameters/index";
  }

  @GetMapping("/single/{id}") 
  public String singlePathParameter(@PathVariable int id, Model model) {
    model.addAttribute("title", "Single Path Parameters");
    model.addAttribute("id", id);
    return "path-parameters/single";
  }

  @GetMapping("/multiple/{name}/{email}")
  public String multiplePathParameters(@PathVariable String name, @PathVariable String email, Model model) {
    model.addAttribute("title", "Multiple Path Parameters");
    model.addAttribute("name", name);
    model.addAttribute("email", email);
    return "path-parameters/multiple";
  }
}
