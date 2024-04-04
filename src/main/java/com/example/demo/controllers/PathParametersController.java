package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path-parameters")
public class PathParametersController {
  @GetMapping("/{id}") 
  public String main(@PathVariable int id, Model model) {
    model.addAttribute("title", "Path Parameters");
    model.addAttribute("id", id);
    return "path-parameters/index";
  }
}
