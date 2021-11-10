package com.ivoronline.springboot_simple.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //===================================================================
  // HELLO
  //===================================================================
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

}



