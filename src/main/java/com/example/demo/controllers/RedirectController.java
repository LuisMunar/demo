package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
  @GetMapping({"", "/"})
  public String redirect() {
    return "redirect:/app";
    // return "forward:/app";
  }
}
