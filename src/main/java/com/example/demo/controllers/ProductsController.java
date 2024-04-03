package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/products")
public class ProductsController {
  @GetMapping("")
  public String getProducts(Model model) {
    model.addAttribute("title", "Products");
    return "products/index";
  }

  @GetMapping("/details")
  public String getProductDetail(@RequestParam(required=false, defaultValue="0") int id, Model model) {
    model.addAttribute("title", "Product Details");
    model.addAttribute("id", id);
    return "products/details";
  }
}
