package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/query-string-parameters")
public class QueryStringParameters {
  @GetMapping("")
  public String getProducts(Model model) {
    model.addAttribute("title", "Products");
    return "query-string-parameters/index";
  }

  @GetMapping("/details")
  public String getProductDetail(@RequestParam(required=false, defaultValue="0") int id, @RequestParam(required=false, defaultValue="empty") String name, Model model) {
    model.addAttribute("title", "Product Details");
    model.addAttribute("id", id);
    model.addAttribute("name", name);
    return "query-string-parameters/details";
  }
}
