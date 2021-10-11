package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/forbrugerne")
    public String forbrugerne() {
        return "forbrugerne.html";
    }

    @GetMapping("/virksomhed")

    public String virksomhed() {
        return "virksomhed.html";
    }

    @GetMapping("/organisation")

    public String organisation() {
        return "organisation.html";
    }

    @GetMapping("/andet")

    public String andet() {
        return "andet";
    }
    @GetMapping("/madplan")
    public String pushButton(@RequestParam String mad) {
        return mad + "" ;}
    }

