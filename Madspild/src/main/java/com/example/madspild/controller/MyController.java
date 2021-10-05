package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
@GetMapping("/")
    @ResponseBody
    public String index(){
    return "index";
}
@GetMapping("/forbrugere")
    @ResponseBody
    public String forbrugere(){
    return "forbrugere";
}
@GetMapping("/virksomhed")
    @ResponseBody
    public String virksomhed(){
    return "virksomhed";
}
@GetMapping("/organisation")
    @ResponseBody
    public String organisation(){
    return "organisation";
}
@GetMapping("/andet")
    @ResponseBody
    public String andet(){
    return "andet";
}
}
