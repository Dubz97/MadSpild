package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/forbrugere")
  public String forbrugere() {
    return "forbrugere";
  }

  @GetMapping("/virksomhed")
  public String virksomhed() {
    return "virksomhed";
  }

  @GetMapping("/organisation")
  public String organisation() {
    return "organisation";
  }

  @GetMapping("/andet")
  public String andet() {
    return "andet";
  }
}
