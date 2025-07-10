package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{
  @RequestMapping("/hello")
  @ResponseBody
  public String sayHello(){
    return "<h1>Hello From Classic Spring Completed</h1>";
  }
}
